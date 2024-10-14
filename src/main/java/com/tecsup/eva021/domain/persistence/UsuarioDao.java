package com.tecsup.eva021.domain.persistence;

import com.tecsup.eva021.domain.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Integer> {
}
