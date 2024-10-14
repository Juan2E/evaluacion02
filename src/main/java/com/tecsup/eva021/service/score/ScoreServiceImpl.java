package com.tecsup.eva021.service.score;

import com.tecsup.eva021.domain.entities.Score;
import com.tecsup.eva021.domain.persistence.ScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService{
    @Autowired
    private ScoreDao dao;

    @Override
    @Transactional
    public void grabar(Score score) {
        dao.save(score);
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        dao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Score buscar(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Score> listar() {
        return (List<Score>)dao.findAll();
    }
}

