package tech.awakelab.jpapreventionsprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.jpapreventionsprint.models.Usuario;
import tech.awakelab.jpapreventionsprint.models.Visita;
import tech.awakelab.jpapreventionsprint.service.UsuarioService;
import tech.awakelab.jpapreventionsprint.service.VisitaService;

@Controller
public class VisitaController {
	
	@Autowired
	VisitaService vs;
	@Autowired
	UsuarioService us;
	
	@RequestMapping(value="/listar-visitas", method = RequestMethod.GET)
	public ModelAndView showAllVisits() {
		List<Visita> visitas = vs.getAllVisits();
		return new ModelAndView("listar-visitas","visitas",visitas);
	}
	@RequestMapping(value="/nueva-visita", method = RequestMethod.GET)
	public ModelAndView showVisitForm() {
		List<Usuario> usuarios = us.getAllUsers();
		return new ModelAndView("crear-visita","usuarios", usuarios);
	}
	
	@RequestMapping(value = "/crear-visita", method = RequestMethod.POST)
	public String saveVisit(Visita visita) {
			vs.saveVisit(visita);		
	    return "redirect:/listar-visitas"; // Redirigir al listao de visitas
	} 
	
}
