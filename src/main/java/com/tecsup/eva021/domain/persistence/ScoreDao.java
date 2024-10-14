package com.tecsup.eva021.domain.persistence;

import com.tecsup.eva021.domain.entities.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreDao extends CrudRepository<Score, Integer> {
}