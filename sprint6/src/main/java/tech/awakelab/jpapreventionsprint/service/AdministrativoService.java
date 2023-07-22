package tech.awakelab.jpapreventionsprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Administrativo;
import tech.awakelab.jpapreventionsprint.repository.IAdministrativoRepository;

@Service
public class AdministrativoService {
	@Autowired
	IAdministrativoRepository administrativoRepository;

	public AdministrativoService() {
		super();
	}
	
	public void saveAdministrativo(Administrativo administrativo) {
		administrativoRepository.save(administrativo);
	}
	
	public List<Administrativo> getAllAdministrativos() {
		return  administrativoRepository.findAll();
	}
	
	public Optional<Administrativo> findById(int id) {
		return administrativoRepository.findById(id);
	}
}
