package tech.awakelab.jpapreventionsprint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.awakelab.jpapreventionsprint.models.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}
