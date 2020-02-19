package com.proyecto.clientes.models.service;

import java.util.List;

import com.proyecto.clientes.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> listarTodos();
	public void guardar(Cliente cliente);
	public Cliente buscarPorId(Long id);
	public void eliminar(Long id);
	
	
}
