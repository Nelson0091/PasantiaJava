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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.pasantia.application.dto.VehiculoDTO;
import com.pasantia.application.entity.Vehiculo;
import com.pasantia.application.model.Response;
import com.pasantia.application.service.VehiculoService;

@Controller
@RequestMapping("/api/v1/vehiculo")
@Api(tags="Maestro de vehiculos")

public class VehiculoController {
	@Autowired
	private VehiculoService vehiculoService;
	/**
	 * Crea un vehiculo
	 * <p>
	 * Version:
	 * <ul>
	 * <li> 24-09-2022 [Nelson Roldan], version inicial.</li>
	 * </ul>
	 * </p>
	 * @param vehiculo VehiculoDTO.
	 * @return ResponseEntity<Response<VehiculoDTO>>
	 */
	
	@PostMapping
	@ApiOperation(value="Crear vehiculo", notes="crea un vehiculo")
	public ResponseEntity<Vehiculo> crearVehiculo( @RequestBody VehiculoDTO vehiculo){
		System.out.println("****MARCA " + vehiculo.getMarca());
		System.out.println("****ANIO " + vehiculo.getAnio());
		System.out.println("****VELOCIDAD " + vehiculo.getVelocidad());
		System.out.println("****NEUMATICOS " + vehiculo.getNeumaticos());
		System.out.println("****ASIENTOS " + vehiculo.getAsientos());
		System.out.println("****PESO (Kg) " + vehiculo.getPeso());


		return new ResponseEntity<>(vehiculoService.create(vehiculo), HttpStatus.CREATED);
	}
	
	@GetMapping()
	@ApiOperation(value="Selecciona un vehiculo", notes="Selecciona un vehiculo por id")
	public ResponseEntity<Vehiculo> getVehiculo( @RequestParam String idVehiculo)
	{
	
		return new ResponseEntity<Vehiculo>(vehiculoService.obtenerVehiculo(Long.valueOf(idVehiculo)), HttpStatus.OK);
	}
	
	@GetMapping("/list")
	@ApiOperation(value="Selecciona todos los vehiculos", notes="Devuelve una lista con todos vehiculos")
	public ResponseEntity<List<Vehiculo>> selectVehiculo ()
	{
		return new ResponseEntity<List<Vehiculo>>(vehiculoService.selecVehiculo(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	@ApiOperation(value="Actualiza Vehiculos", notes="Actualiza los datos del Vehiculo")
	public ResponseEntity<Vehiculo> updateVehiculo( @RequestBody VehiculoDTO vehiculo){
		
		System.out.println("****PLACA " + vehiculo.getIdPlaca());
		System.out.println("****MARCA " + vehiculo.getMarca());
		System.out.println("****ANIO " + vehiculo.getAnio());
		System.out.println("****VELOCIDAD " + vehiculo.getVelocidad());
		System.out.println("****NEUMATICOS " + vehiculo.getNeumaticos());
		System.out.println("****ASIENTOS " + vehiculo.getAsientos());
		System.out.println("****PESO (Kg) " + vehiculo.getPeso());



		return new ResponseEntity<>(vehiculoService.update(vehiculo), HttpStatus.OK);
	}

}
