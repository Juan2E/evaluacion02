package com.tecsup.eva021.service.tourment;

import com.tecsup.eva021.domain.entities.Tourment;

import java.util.List;

public interface TourmentService {
    public void grabar(Tourment tourment);
    public void eliminar(int id);
    public Tourment buscar(Integer id);
    public List<Tourment> listar();
}