package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Rol;
import mj.gob.sisadmrh.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dialv
 */
@Service
public class RolServiceImpl implements RolService {

    
    private RolRepository usuarioRep;

    @Autowired
    public void setRolRepository(RolRepository usuarioRepository) {
        this.usuarioRep = usuarioRepository;
    }

    @Override
    public Iterable<Rol> listAllRoles() {
        return usuarioRep.findAll();
    }

    @Override
    public Optional<Rol> getRolById(Integer id) {
        return usuarioRep.findById(id);
    }

    @Override
    public Rol saveRol(Rol usuario) {
        return usuarioRep.save(usuario);
    }

    @Override
    public void deleteRol(Integer id) {
        usuarioRep.deleteById(id);
    }

}
