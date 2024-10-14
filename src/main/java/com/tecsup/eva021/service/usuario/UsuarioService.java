package com.tecsup.eva021.service.usuario;

import com.tecsup.eva021.domain.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public void grabar(Usuario user);
    public void eliminar(int id);
    public Usuario buscar(Integer id);
    public List<Usuario> listar();
}