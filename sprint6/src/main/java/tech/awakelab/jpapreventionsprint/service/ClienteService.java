package tech.awakelab.jpapreventionsprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Cliente;
import tech.awakelab.jpapreventionsprint.repository.IClienteRepository;

@Service
public class ClienteService {
	@Autowired
	IClienteRepository clienteRepository;

	public ClienteService() {
		super();
	}
	
	public void saveCustomer(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllCustomer() {
		return clienteRepository.findAll();
	}
	
	public Optional<Cliente> findById(int id) {
		return clienteRepository.findById(id);
	}
}
