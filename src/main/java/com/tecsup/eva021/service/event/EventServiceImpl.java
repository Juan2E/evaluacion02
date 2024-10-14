package com.tecsup.eva021.service.event;

import com.tecsup.eva021.domain.entities.Event;
import com.tecsup.eva021.domain.persistence.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    private EventDao dao;

    @Override
    @Transactional
    public void grabar(Event event) {
        dao.save(event);
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        dao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Event buscar(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Event> listar() {
        return (List<Event>)dao.findAll();
    }
}

