package com.tecsup.eva021.domain.persistence;

import com.tecsup.eva021.domain.entities.Career;
import org.springframework.data.repository.CrudRepository;


public interface CareerDao extends CrudRepository<Career, Integer> {

}