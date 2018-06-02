package mj.gob.sisadmrh.service;

import mj.gob.sisadmrh.model.Usuario;
import mj.gob.sisadmrh.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dialv
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRep;
    @Override
    public Iterable<Usuario> listAllUsuarios() {
    return usuarioRep.findAll();
    }
    
    
}
