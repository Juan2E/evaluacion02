package com.tecsup.eva021.service.career;

import com.tecsup.eva021.domain.entities.Career;

import java.util.List;

public interface CareerService {
    public void grabar(Career career);
    public void eliminar(int id);
    public Career buscar(Integer id);
    public List<Career> listar();
}