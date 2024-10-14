package com.tecsup.eva021.service.event;

import com.tecsup.eva021.domain.entities.Event;

import java.util.List;

public interface EventService {
    public void grabar(Event event);
    public void eliminar(int id);
    public Event buscar(Integer id);
    public List<Event> listar();
}
