package mj.gob.sisadmrh.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import mj.gob.sisadmrh.model.Usuario;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author root
 */
public class AppUserMapper implements RowMapper<Usuario> {
 
    public static final String BASE_SQL //
            = "Select u.CODIGOUSUARIO, u.NOMBREUSUARIO, u.CONTRASENIAUSUARIO From Usuario u ";
 
    @Override
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
 
        Long userId = rs.getLong("CODIGOUSUARIO");
        String userName = rs.getString("NOMBREUSUARIO");
        String encrytedPassword;
        encrytedPassword = rs.getString("CONTRASENIAUSUARIO");
 
        return new Usuario();
    }
}