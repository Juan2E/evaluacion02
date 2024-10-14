package com.tecsup.eva021.service.tourment;

import com.tecsup.eva021.domain.entities.Tourment;
import com.tecsup.eva021.domain.persistence.TourmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TourmentServiceImpl implements TourmentService{
    @Autowired
    private TourmentDao dao;

    @Override
    @Transactional
    public void grabar(Tourment tourment) {
        dao.save(tourment);
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        dao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Tourment buscar(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tourment> listar() {
        return (List<Tourment>)dao.findAll();
    }

}

