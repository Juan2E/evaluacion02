package com.tecsup.eva021.domain.persistence;

import com.tecsup.eva021.domain.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventDao extends CrudRepository<Event, Integer> {
}
