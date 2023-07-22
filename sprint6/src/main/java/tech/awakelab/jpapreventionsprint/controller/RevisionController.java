package tech.awakelab.jpapreventionsprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.jpapreventionsprint.models.Revision;
import tech.awakelab.jpapreventionsprint.models.Visita;
import tech.awakelab.jpapreventionsprint.service.RevisionService;
import tech.awakelab.jpapreventionsprint.service.VisitaService;

@Controller
public class RevisionController {

	@Autowired
	RevisionService rs;
	@Autowired
	VisitaService vs;
	
	@RequestMapping(value="/revs", method = RequestMethod.GET)
	public ModelAndView mostrarRevisiones() {
		List<Revision> revisiones = rs.getAllRevisiones();
		return new ModelAndView("listar-revs","revisiones",revisiones);
	}
	
	@RequestMapping(value="/nueva-revision", method = RequestMethod.GET)
	public ModelAndView showRevisionForm() {
		List<Visita> visitas = vs.getAllVisits();
		return new ModelAndView("crear-revision","visitas", visitas);
	}
	
	@RequestMapping(value = "/crear-revision", method = RequestMethod.POST)
	public String saveRevision(Revision revision) {
			rs.saveRevision(revision);		
	    return "redirect:/revs"; // Redirigir al listado de revisiones
	} 
	
}
