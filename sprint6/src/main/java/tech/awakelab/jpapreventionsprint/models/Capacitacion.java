package tech.awakelab.jpapreventionsprint.models;

import java.io.Serializable;
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
@Table(name="capacitaciones")
public class Capacitacion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="dia")
	private String dia;
	@Column(name="hora")
	private String hora;
	@Column(name="lugar")
	private String lugar;
	@Column(name="duracion")
	private String duracion;
	@Column(name="cantidad_asistentes")
	private int cantidadAsistentes;
	
	@ManyToOne
	@JoinColumn(name="cap_cliente")
	private Cliente cliente;
	
	@Column(name="create_at")	
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist //antes de persistir la info en la bd se crea la fecha
	public void prePersist() {
		createAt = new Date();
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getId() {
		return id;
	}

	public String getDia() {
		return dia;
	}
	public String getHora() {
		return hora;
	}
	public String getLugar() {
		return lugar;
	}
	public String getDuracion() {
		return duracion;
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
}
