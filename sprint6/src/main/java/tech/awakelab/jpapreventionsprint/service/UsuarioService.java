package tech.awakelab.jpapreventionsprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Usuario;
import tech.awakelab.jpapreventionsprint.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	public UsuarioService() {

	}
	
	public void saveUsers(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> getAllUsers() {
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> findById(int id) {
		return usuarioRepository.findById(id);
	}
}
