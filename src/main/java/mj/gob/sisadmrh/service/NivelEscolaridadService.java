/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.NivelEscolaridad;


public interface NivelEscolaridadService {
    Iterable <NivelEscolaridad> listAllNivelEscolaridad();
    
    Optional<NivelEscolaridad> getNivelEscolaridadById(Integer id);

    NivelEscolaridad saveNivelEscolaridad(NivelEscolaridad nivelescolaridad);

    void deleteNivelEscolaridad(Integer id);
}
