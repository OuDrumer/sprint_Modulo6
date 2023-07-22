package tech.awakelab.jpapreventionsprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.jpapreventionsprint.models.Pago;
import tech.awakelab.jpapreventionsprint.service.PagoService;

@Controller
@RequestMapping("/pagos")
public class PagoController {
	@Autowired
	PagoService ps;
	
	@RequestMapping(value="/listar-pagos", method = RequestMethod.GET)
	public ModelAndView showAllPagos() {
		List<Pago> pagos = ps.getPagos();
		return new ModelAndView ("listar-pagos","pagos",pagos);
	}
	
	@RequestMapping(value="/formulario-pago", method = RequestMethod.GET)
	public ModelAndView showPagosForm() {
		return new ModelAndView ("crear-pago");
	}
	
	@RequestMapping(value="/createPago", method = RequestMethod.POST)
	public String savePay(Pago pago) {
		ps.savePago(pago);
		return ("redirect:/pagos/listar-pagos");
	}
}
