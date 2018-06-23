/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.commons.io.IOUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author root
 */
public class UtilsController {

    public static String EMPTY_STRING = "";

    public static boolean isNullOrEmpty(Object obj) {
        if (obj == null || obj.toString().length() < 1
                || obj.toString().equals(EMPTY_STRING)) {
            return true;
        }
        return false;
    }

    public String getPath(String folder) {
        String path = getRequest().getSession().getServletContext()
                .getRealPath(folder);
        if (!path.endsWith(System.getProperty("file.separator"))) {
            path = path + System.getProperty("file.separator");
        }
        return path;
    }

    public File getReportFile(String reportPath) {
        ServletContext context = getRequest().getSession().getServletContext();
        File reportFile = new File(context.getRealPath(reportPath));
        return reportFile;
    }

    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    public void generatePdf(
            String siglasFormulario,
            String reportCode,
            Map<String, Object> paramsFormulario,
            Connection con,
            HttpServletRequest request,
            Boolean download,
            HttpServletResponse response) throws ServletException, IOException,
            ClassNotFoundException, SQLException, JRException, Exception {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("IMAGE_PATH", getPath("/report_images/"));
        params.put("SUBREPORT_DIR", getPath("/WEB-INF/reports/" + siglasFormulario + "/"));
        params.putAll(paramsFormulario);

        JasperReport jasperReport = (JasperReport) JRLoader
                .loadObjectFromFile(getReportFile(
                        "//WEB-INF/reports/" + siglasFormulario + "/" + reportCode + ".jasper")
                        .getPath());
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                params, con);
        List<JasperPrint> jasperPrintList = new ArrayList<JasperPrint>();
        jasperPrintList.add(jasperPrint);

        try {
            //ServletOutputStream out = response.getOutputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            JRPdfExporter s = new JRPdfExporter();

            s.setParameter(JRExporterParameter.JASPER_PRINT_LIST,
                    jasperPrintList);
            s.setParameter(JRPdfExporterParameter.OUTPUT_STREAM, baos);
            s.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, reportCode
                    + ".pdf");
            s.setParameter(
                    JRPdfExporterParameter.IS_CREATING_BATCH_MODE_BOOKMARKS,
                    Boolean.TRUE);
            s.exportReport();

            response.setContentType("application/pdf");
            response.setContentLength(baos.toByteArray().length);

            if (!isNullOrEmpty(download) && download) {
                response.setHeader("Content-Disposition",
                        "attachment; filename=\"" + siglasFormulario + ".pdf"
                        + "\"");
            }

            InputStream is = new ByteArrayInputStream(baos.toByteArray());
            IOUtils.copy(is, response.getOutputStream());
            response.flushBuffer();
            //out.write(baos.toByteArray(), 0, baos.toByteArray().length);
            //out.flush();
            //out.close();
        } catch (Exception e) {
            throw e;
        } finally {
            con.close();
        }

    }
}
