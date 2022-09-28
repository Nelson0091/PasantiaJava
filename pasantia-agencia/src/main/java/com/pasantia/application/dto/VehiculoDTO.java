package com.pasantia.application.dto;

import java.io.Serializable;

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
public class VehiculoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6264721090652085974L;

	@ApiModelProperty(notes = "id de la placa del vehiculo", name = "idPlaca", example = "1L")
	private Long idPlaca;
	
	@ApiModelProperty(notes = "marca del vehiculo", name = "marca", example = "Toyota")
	private String marca;
	
	@ApiModelProperty(notes = "anio del vehiculo", name = "anio", example = "1981")
	private int anio;

	@ApiModelProperty(notes = "velocidades del vehiculo", name = "velocidad", example = "5")
	private int velocidad;

	@ApiModelProperty(notes = "color del vehiculo", name = "color", example = "rojo")
	private String color;

	@ApiModelProperty(notes = "numero de neumaticos del vehiculo", name = "neumaticos", example = "4")
	private int neumaticos;
	
	@ApiModelProperty(notes = "numero de asientos que posee el vehiculo", name = "asientos", example = "4")
	private int asientos;
	
	@ApiModelProperty(notes = "peso maximo permitido en el vehiculo", name = "peso", example = "150")
	private int peso;
	
	@ApiModelProperty(notes = "id del proveedor o agencia de viajes", name = "idProveedor", example = "1L")
	private Long idProveedor;

	public Long getIdPlaca() {
		return idPlaca;
	}

	public void setIdVehiculo(Long idPlaca) {
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
