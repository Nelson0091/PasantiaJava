package com.pasantia.application.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@ToString
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE, force=true)
@FieldNameConstants
@Entity
@Table(name = "vehiculo")
@EqualsAndHashCode
public class Vehiculo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3014921318784967355L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_placa")
	private Long idPlaca;
	
	@Column(name = "marca")
	private String marca;

	@Column(name = "anio")
	private int anio;

	@Column(name = "velocidades")
	private int velocidad;

	@Column(name = "color")
	private String color;

	@Column(name = "num_neumaticos")
	private int neumaticos;
	
	@Column(name = "num_asientos")
	private int asientos;
	
	@Column(name = "max_peso")
	private int peso;
	
	@Column(name = "id_proveedor")
	private Long idProveedor;

	public Long getIdPlaca() {
		return idPlaca;
	}

	public void setIdPlaca(Long idPlaca) {
		this.idPlaca = idPlaca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNeumaticos() {
		return neumaticos;
	}

	public void setNeumaticos(int neumaticos) {
		this.neumaticos = neumaticos;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}
	
	

}
