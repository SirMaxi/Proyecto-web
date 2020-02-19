package com.proyecto.clientes.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.clientes.models.entity.Cliente;
import com.proyecto.clientes.models.repository.ClienteRepository;

@Service
public class ClienteServiceImplement implements IClienteService {

	@Autowired
	private ClienteRepository clienbteRepository;
	
	
	@Override
	public List<Cliente> listarTodos() {
		return (List<Cliente>) clienbteRepository.findAll();
	}

	@Override
	public void guardar(Cliente cliente) {
		clienbteRepository.save(cliente);
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return clienbteRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		clienbteRepository.deleteById(id);
	}

}
