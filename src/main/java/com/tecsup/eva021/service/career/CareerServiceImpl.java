package com.tecsup.eva021.service.career;

import com.tecsup.eva021.domain.entities.Career;
import com.tecsup.eva021.domain.persistence.CareerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CareerServiceImpl implements CareerService {

    @Autowired
    private CareerDao dao;

    @Override
    @Transactional
    public void grabar(Career career) {
        dao.save(career);
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        dao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Career buscar(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Career> listar() {
        return (List<Career>)dao.findAll();
    }
}