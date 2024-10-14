package com.tecsup.eva021.service.depart;

import com.tecsup.eva021.domain.entities.Depart;

import java.util.List;

public interface DepartService {
    public void grabar(Depart depart);
    public void eliminar(int id);
    public Depart buscar(Integer id);
    public List<Depart> listar();
}
