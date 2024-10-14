package com.tecsup.eva021.domain.persistence;

import com.tecsup.eva021.domain.entities.Auditoria;
import org.springframework.data.repository.CrudRepository;

public interface AuditoriaDao extends CrudRepository<Auditoria, Integer> {
}

