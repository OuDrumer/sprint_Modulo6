package tech.awakelab.jpapreventionsprint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Capacitacion;
import tech.awakelab.jpapreventionsprint.repository.ICapacitacionRepository;

@Service
public class CapacitacionService {
	
	@Autowired
	private ICapacitacionRepository capacitacionRepository;
	
	public CapacitacionService() {
		
	}

	public List<Capacitacion> getAllTrainings() {
		return capacitacionRepository.findAll();
	}

	public void saveTrainings(Capacitacion capacitacion) {
		capacitacionRepository.save(capacitacion);
	}
}