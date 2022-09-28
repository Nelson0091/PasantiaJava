package com.pasantia.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pasantia.application.dto.ViajeDTO;
import com.pasantia.application.entity.Viaje;
import com.pasantia.application.service.ViajeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/api/v1/viaje")
@Api(tags="Maestro de viajes")

public class ViajeController {
	@Autowired
	private ViajeService viajeService;
	/**
	 * Crea un viaje
	 * <p>
	 * Version:
	 * <ul>
	 * <li> 24-09-2022 [Nelson Roldan], version inicial.</li>
	 * </ul>
	 * </p>
	 * @param viaje ViajeDTO.
	 * @return ResponseEntity<Response<ViajeDTO>>
	 */
	
	@PostMapping
	@ApiOperation(value="Crear viaje", notes="crea un viaje")
	public ResponseEntity<Viaje> crearViaje( @RequestBody ViajeDTO viaje){
		System.out.println("****Costo del boleto " + viaje.getCostoboleto());
		System.out.println("****Numero de Pasajeros " + viaje.getNumpasajeros());
		System.out.println("***Peso total* " + viaje.getPesototal());
		System.out.println("****Fecha de viaje " + viaje.getFechaviaje());
		System.out.println("****Destino " + viaje.getDestino());
		System.out.println("****Precio del equipaje (kg) " + viaje.getPreciokgequipaje());
		System.out.println("****Placa del vehiculo " + viaje.getIdPlaca());


		return new ResponseEntity<>(viajeService.create(viaje), HttpStatus.CREATED);
	}
	
	@GetMapping()
	@ApiOperation(value="Selecciona un viaje", notes="Selecciona un viaje por id")
	public ResponseEntity<Viaje> getViaje( @RequestParam String idViaje)
	{
	
		return new ResponseEntity<Viaje>(viajeService.obtenerViaje(Long.valueOf(idViaje)), HttpStatus.OK);
	}
	
	@GetMapping("/list")
	@ApiOperation(value="Selecciona todos los viajess", notes="Devuelve una lista con todos viajes")
	public ResponseEntity<List<Viaje>> selectViaje ()
	{
		return new ResponseEntity<List<Viaje>>(viajeService.selectViaje(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	@ApiOperation(value="Actualiza Viajes", notes="Actualiza los datos del Viaje")
	public ResponseEntity<Viaje> updateViaje( @RequestBody ViajeDTO viaje){
		
		System.out.println("****Id del viaje " + viaje.getIdViaje());
		System.out.println("****Costo del boleto " + viaje.getCostoboleto());
		System.out.println("****Numero de pasajeros " + viaje.getNumpasajeros());
		System.out.println("****Peso total " + viaje.getPesototal());
		System.out.println("****Fecha de viaje " + viaje.getFechaviaje());
		System.out.println("****Destino " + viaje.getDestino());
		System.out.println("****Precio del equipaje por (kg) " + viaje.getPreciokgequipaje());
		System.out.println("****Placa del vehiculo " + viaje.getIdPlaca());



		return new ResponseEntity<>(viajeService.update(viaje), HttpStatus.OK);
	}

}
