package com.tecsup.eva021.service.score;

import com.tecsup.eva021.domain.entities.Score;

import java.util.List;

public interface ScoreService {
    public void grabar(Score score);
    public void eliminar(int id);
    public Score buscar(Integer id);
    public List<Score> listar();
}

