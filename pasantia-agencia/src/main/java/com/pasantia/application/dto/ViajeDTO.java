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
public class ViajeDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6264721090652085974L;

	@ApiModelProperty(notes = "id del viaje", name = "idViaje", example = "1L")
	private Long idViaje;
	
	@ApiModelProperty(notes = "muestra el costo del boleto", name = "costoboleto", example = "50")
	private int costoboleto;
	
	@ApiModelProperty(notes = "muestra el numero de pasajeros que realizaran el viaje", name = "numpasajeros", example = "3")
	private int numpasajeros;

	@ApiModelProperty(notes = "muestra el peso total", name = "pesototal", example = "60")
	private int pesototal;

	@ApiModelProperty(notes = "muestra la fecha en que se realiza el viaje", name = "fechaviaje", example = "AAAA-MM-DD")
	private Date fechaviaje;

	@ApiModelProperty(notes = "muestra el destino a donde se realizara el viaje", name = "destino", example = "Rumania")
	private String destino;
	
	@ApiModelProperty(notes = "numero de asientos que posee el vehiculo", name = "preciopersona", example = "20")
	private int preciopersona;
	
	@ApiModelProperty(notes = "precio del equipaje por kg", name = "preciokgequipaje", example = "50")
	private int preciokgequipaje;
	
	@ApiModelProperty(notes = "id o placa del vehiculo", name = "idPlaca", example = "1L")
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
