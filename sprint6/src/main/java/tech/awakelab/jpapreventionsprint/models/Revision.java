package tech.awakelab.jpapreventionsprint.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="revisiones")
public class Revision {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreVisita;
	private String detalle;
	private String estado;
	@Column(name="create_at")	
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist //antes de persistir la info en la bd se crea la fecha
	public void prePersist() {
		createAt = new Date();
	}
	
	@ManyToOne
	@JoinColumn(name="id_visita")
	private Visita visita;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreVisita() {
		return nombreVisita;
	}

	public void setNombreVisita(String nombreVisita) {
		this.nombreVisita = nombreVisita;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Visita getVisita() {
		return visita;
	}

	public void setVisita(Visita visita) {
		this.visita = visita;
	}
	
	

}
