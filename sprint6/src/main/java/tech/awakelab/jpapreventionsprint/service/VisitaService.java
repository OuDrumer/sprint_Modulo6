package tech.awakelab.jpapreventionsprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Visita;
import tech.awakelab.jpapreventionsprint.repository.IVisitaRepository;

@Service
public class VisitaService {
	
	@Autowired
	private IVisitaRepository visitaRepository;

	public VisitaService() {

	}
	
	public void saveVisit(Visita visita) {
		visitaRepository.save(visita);
	}
	
	public List<Visita> getAllVisits() {
		return visitaRepository.findAll();
	}
	
	public Optional<Visita> getById(int id){
		return visitaRepository.findById(id);
	}
}
