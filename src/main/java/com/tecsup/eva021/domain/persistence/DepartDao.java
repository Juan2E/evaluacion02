package com.tecsup.eva021.domain.persistence;

import com.tecsup.eva021.domain.entities.Depart;
import org.springframework.data.repository.CrudRepository;

public interface DepartDao extends CrudRepository<Depart, Integer> {
}
