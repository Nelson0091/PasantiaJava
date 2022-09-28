package com.pasantia.application.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "viaje")
@EqualsAndHashCode

public class Viaje implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3014921318784967355L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_viaje")
	private Long idViaje;
	
	@Column(name = "costo_boleto")
	private int costoboleto;

	@Column(name = "num_pasajeros")
	private int numpasajeros;

	@Column(name = "peso_total")
	private int pesototal;

	@Column(name = "fecha_viaje")
	private Date fechaviaje;

	@Column(name = "destino")
	private String destino;
	
	@Column(name = "precio_persona")
	private int preciopersona;
	
	@Column(name = "precio_kg_equipaje")
	private int preciokgequipaje;
	
	@Column(name = "id_placa")
	private Long idPlaca;

	public Long getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(Long idViaje) {
		this.idViaje = idViaje;
	}

	public int getCostoboleto() {
		return costoboleto;
	}

	public void setCostoboleto(int costoboleto) {
		this.costoboleto = costoboleto;
	}

	public int getNumpasajeros() {
		return numpasajeros;
	}

	public void setNumpasajeros(int numpasajeros) {
		this.numpasajeros = numpasajeros;
	}

	public int getPesototal() {
		return pesototal;
	}

	public void setPesototal(int pesototal) {
		this.pesototal = pesototal;
	}

	public Date getFechaviaje() {
		return fechaviaje;
	}

	public void setFechaviaje(Date fechaviaje) {
		this.fechaviaje = fechaviaje;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getPreciopersona() {
		return preciopersona;
	}

	public void setPreciopersona(int preciopersona) {
		this.preciopersona = preciopersona;
	}

	public int getPreciokgequipaje() {
		return preciokgequipaje;
	}

	public void setPreciokgequipaje(int preciokgequipaje) {
		this.preciokgequipaje = preciokgequipaje;
	}

	public Long getIdPlaca() {
		return idPlaca;
	}

	public void setIdPlaca(Long idPlaca) {
		this.idPlaca = idPlaca;
	}
	

}
