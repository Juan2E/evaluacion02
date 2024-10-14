package com.tecsup.eva021.domain.persistence;

import com.tecsup.eva021.domain.entities.Tourment;
import org.springframework.data.repository.CrudRepository;

public interface TourmentDao extends CrudRepository<Tourment, Integer> {
}
