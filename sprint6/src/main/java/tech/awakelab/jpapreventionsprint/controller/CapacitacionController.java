package tech.awakelab.jpapreventionsprint.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.jpapreventionsprint.models.Capacitacion;
import tech.awakelab.jpapreventionsprint.service.CapacitacionService;

@Controller
public class CapacitacionController {
	
	
	@Autowired
	CapacitacionService cs;
	
	@RequestMapping(path ="/capacitacion/new", method = RequestMethod.GET)
	public ModelAndView getTrainingForm() {
		return new ModelAndView("crear-capacitacion","","");
	}
	
	@RequestMapping(value="/capacitaciones", method = RequestMethod.GET)
	public ModelAndView showAllTrainings() {
		List<Capacitacion> capacitaciones = cs.getAllTrainings();
		return new ModelAndView("listar-capacitaciones", "capacitaciones", capacitaciones);
	}
	
	@RequestMapping(value = "/capacitacion/save", method = RequestMethod.POST)
	public String saveTraining(Capacitacion capacitacion) {
		
	    cs.saveTrainings(capacitacion); 
	    return "redirect:/capacitaciones"; // Redirigir al usuario a la lista de capacitaciones
	}
	
	
	
	// Para el formulario de login
	@RequestMapping(value="/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/error")
	public ModelAndView errorLogin() {
		return new ModelAndView("login", "error", "true");
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logout() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return new ModelAndView("redirect:/login?logout");
	}

}
