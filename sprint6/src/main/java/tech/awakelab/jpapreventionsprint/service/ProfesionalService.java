package tech.awakelab.jpapreventionsprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Profesional;
import tech.awakelab.jpapreventionsprint.repository.IProfesionalRepository;

@Service
public class ProfesionalService {
	@Autowired
	IProfesionalRepository profesionalRepository;

	public ProfesionalService() {
		super();
	}
	
	public void saveProfesional(Profesional profesional) {
		profesionalRepository.save(profesional);
	}
	
	public List<Profesional> getAllProfesional() {
		return  profesionalRepository.findAll();
	}
	
	public Optional<Profesional> findById(int id) {
		return profesionalRepository.findById(id);
	}

}
