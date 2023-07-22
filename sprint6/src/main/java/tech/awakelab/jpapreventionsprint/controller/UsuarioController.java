package tech.awakelab.jpapreventionsprint.controller;

import java.net.http.HttpRequest;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.jpapreventionsprint.models.Administrativo;
import tech.awakelab.jpapreventionsprint.models.Cliente;
import tech.awakelab.jpapreventionsprint.models.Profesional;
import tech.awakelab.jpapreventionsprint.models.Usuario;
import tech.awakelab.jpapreventionsprint.service.AdministrativoService;
import tech.awakelab.jpapreventionsprint.service.ClienteService;
import tech.awakelab.jpapreventionsprint.service.ProfesionalService;
import tech.awakelab.jpapreventionsprint.service.UsuarioService;


@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioService 			us;
	@Autowired
	ClienteService 			cs;
	@Autowired
	ProfesionalService 		ps;
	@Autowired
	AdministrativoService 	as;	
	
	@RequestMapping(value="/lista-usuarios", method = RequestMethod.GET)
	public ModelAndView showAllUsers() {		
			List<Usuario> usuarios = us.getAllUsers();
			return new ModelAndView("listar-usuarios", "usuarios", usuarios);		
	}
	
	@RequestMapping(value="/createForm", method = RequestMethod.GET)
	public ModelAndView showCreateUserForm() {		
		return new ModelAndView("crear-usuarios","", "");
	}
	
	@RequestMapping(value="/create-user", method = RequestMethod.POST)
	public String saveUser(Usuario usuario, HttpServletRequest request) {
		us.saveUsers(usuario);
		String tipoUsuario = request.getParameter("tipoUsuario");
		
	
//		switch (tipoUsuario) {
//			case "Cliente":
//				int telefono = Integer.parseInt(request.getParameter("telefono"));
//				String createAfp = request.getParameter("afp");
//				String createSistemaSalud = request.getParameter("sistemaSalud");
//				String createDireccion = request.getParameter("direccion");
//				String createComuna = request.getParameter("comuna");
//				int createEdad = Integer.parseInt(request.getParameter("edad"));
//				Cliente cliente = new Cliente(usuario, telefono, createAfp, createSistemaSalud, createDireccion, createComuna, createEdad);
//				cs.saveCustomer(cliente);
//				break;
//			case "Profesional":
//				
//				cs.saveCustomer(profesional);
//				break;
//			case "Administrativo":
//				
//				cs.saveCustomer(admin);
//				break;
//		default:
//			break;
//		}
		
		return "redirect:/lista-usuarios";
	}
}
