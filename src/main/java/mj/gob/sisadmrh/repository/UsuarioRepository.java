package mj.gob.sisadmrh.repository;

import mj.gob.sisadmrh.model.Usuario;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UsuarioRepository extends CrudRepository<Usuario, String>{

}
