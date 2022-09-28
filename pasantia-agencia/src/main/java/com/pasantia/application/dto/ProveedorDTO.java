package com.pasantia.application.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder(toBuilder=true)
@JsonIgnoreProperties(ignoreUnknown=true)
@AllArgsConstructor
@ToString
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE, force = true) 
public class ProveedorDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6264721090652085974L;

	@ApiModelProperty(notes = "id del proveedor o agencia de viajes", name = "idProveedor", example = "1L")
	private Long idProveedor;
	
	@ApiModelProperty(notes = "id del proveedor o agencia de viajes", name = "nombre", example = "Nelson")
	private String nombre;
	
	@ApiModelProperty(notes = "numero telefonico del proveedor o agencia de viajes", name = "telefono", example = "0000-0000")
	private String telefono;

	@ApiModelProperty(notes = "correo electronico del proveedor o agencia de viajes", name = "email", example = "pasantiaJava@correo.com")
	private String email;

	@ApiModelProperty(notes = "direccion del proveedor o agencia de viajes", name = "direccion", example = "direccion de prueba")
	private String direccion;

	@ApiModelProperty(notes = "fecha de creacion del registro del proveedor o agencia de viajes", name = "fechaCreacion", example = "AAAA-MM-DD")
	private Date fechaCreacion;
	
	@ApiModelProperty(notes = "fecha de modificacion del registro del proveedor o agencia de viajes", name = "fechaModificacion", example = "AAAA-MM-DD")
	private Date fechaModificacion;

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
}
