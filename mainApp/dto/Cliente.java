package mainApp.dto;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cliente")
public class Cliente {
	//ATRIBUTOS DE ENTIDAD TRABAJADORES
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "trabajo")
	private String trabajo;
	
	@Column(name = "sueldo")
	private int sueldo;
	
	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param sueldo
	 */
	
	
	//CONSTRUCTORES
	public Cliente() {
		
		
	}
	
	public Cliente (Long id,String nombre, String trabajo, int sueldo) {
		this.id=id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.sueldo = sueldo;
	}
	//GETTERS Y SETTERS
	
	/**
	 * @return the id
	 */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Cliente [id_trabajador=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", sueldo="
				+ sueldo + "]";
	}
	
	
	
	
			
}
