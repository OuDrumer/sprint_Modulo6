package tech.awakelab.jpapreventionsprint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Pago;
import tech.awakelab.jpapreventionsprint.repository.IPagoRepository;

@Service
public class PagoService {

	@Autowired
	private IPagoRepository pagoRepository;

	public PagoService() {

	}
	
	public void savePago(Pago pago) {
		pagoRepository.save(pago);
	}
	
	public List<Pago> getPagos(){
		return pagoRepository.findAll();
	}
	
}
