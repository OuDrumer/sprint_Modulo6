package tech.awakelab.jpapreventionsprint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Contacto;
import tech.awakelab.jpapreventionsprint.repository.IContactoRepository;

@Service
public class ContactoService {
	
	@Autowired
	private IContactoRepository contactoRepository;

	public ContactoService() {

	}
	
	public void saveContacto(Contacto contacto) {
		contactoRepository.save(contacto);
	}
	
	
}
