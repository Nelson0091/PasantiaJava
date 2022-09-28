package com.pasantia.application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder(toBuilder=true)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Response<T>{
	/**
	 * Contiene la data valida de respuesta
	 */
	
	private T data;
	
	/**
	 * contiene la data en caso de errores
	 */
	
	//private List<ErrorDetail> errors;

}
