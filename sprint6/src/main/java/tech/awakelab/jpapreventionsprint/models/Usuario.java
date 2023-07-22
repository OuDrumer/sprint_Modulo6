package tech.awakelab.jpapreventionsprint.models;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username")
	private String usuario;	
	private String password;
	private String run;
	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;
	private String nombre;
	private String apellido;
	@Column(name="tipo_usuario")
	private String tipoUsuario;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	
//	public Usuario(int id, String usuario, String password, String run, String fechaNacimiento, String nombre,
//			String apellido, String tipoUsuario, java.sql.Date createAt) {
//		this.usuario = usuario;
//		this.password = password;
//		this.run = run;
//		this.fechaNacimiento = fechaNacimiento;
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.tipoUsuario = tipoUsuario;
//		this.createAt = createAt;
//	}

	@PrePersist //antes de persistir la info en la bd se crea la fecha
	public void prePersist() {
		createAt = new Date();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	private static final long serialVersionUID = 1L;
}
