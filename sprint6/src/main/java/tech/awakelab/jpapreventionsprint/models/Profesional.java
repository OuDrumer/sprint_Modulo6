package tech.awakelab.jpapreventionsprint.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="profesionales")
public class Profesional {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProfesional;	
	private String titulo;
	@Column(name="fecha_ingreso")
	private String fechaIngreso;
	@Column(name="create_at")	
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist //antes de persistir la info en la bd se crea la fecha
	public void prePersist() {
		createAt = new Date();
	}
	
	@OneToOne(cascade= CascadeType.ALL)
    private Usuario usuario;

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
