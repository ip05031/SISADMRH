package mj.gob.sisadmrh.repository;

import mj.gob.sisadmrh.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    @Query("SELECT o FROM Usuario o WHERE o.nombreusuario=?1")
    public Usuario findbyusername(String username);

}
