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
@Table(name="administrativos")
public class Administrativo {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAdministrativo;
	private String area;
	@Column(name="experiencia_previa")
	private String experienciaPrevia;
	@Column(name="create_at")	
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist //antes de persistir la info en la bd se crea la fecha
	public void prePersist() {
		createAt = new Date();
	}
	
	@OneToOne(cascade= CascadeType.ALL)
    private Usuario usuario;

	public int getIdAdministrativo() {
		return idAdministrativo;
	}

	public void setIdAdministrativo(int idAdministrativo) {
		this.idAdministrativo = idAdministrativo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
