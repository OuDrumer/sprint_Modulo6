package tech.awakelab.jpapreventionsprint.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import tech.awakelab.jpapreventionsprint.models.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>{
	
	
}
