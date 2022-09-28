package com.pasantia.application.service.impl;

import com.pasantia.application.repository.VehiculoRepository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pasantia.application.dto.VehiculoDTO;
import com.pasantia.application.entity.Vehiculo;
import com.pasantia.application.service.VehiculoService;

import lombok.AllArgsConstructor;



@AllArgsConstructor
@Service
public class VehiculoServiceImpl<T> implements VehiculoService {
	@Autowired
	private VehiculoRepository vehiculoRepositoryYY;
	
	@Override
	public Vehiculo create(VehiculoDTO vehiculo) {
		try {
			Vehiculo vehiculoToSave = new Vehiculo();
			vehiculoToSave.setMarca(vehiculo.getMarca());
			vehiculoToSave.setAnio(vehiculo.getAnio());
			vehiculoToSave.setVelocidad(vehiculo.getVelocidad());
			vehiculoToSave.setColor(vehiculo.getColor());
			vehiculoToSave.setNeumaticos(vehiculo.getNeumaticos());
			vehiculoToSave.setAsientos(vehiculo.getAsientos());
			vehiculoToSave.setPeso(vehiculo.getPeso());
			
			return vehiculoRepositoryYY.save(vehiculoToSave);
		}catch(Exception ex)
		{
			System.out.println("****ERROR: " + ex.toString());
			return null;
		}
		
	}
	
	@Override
	public Vehiculo obtenerVehiculo(Long id) {
		
		
		return  vehiculoRepositoryYY.findById(id).orElse(null);
	}
	
	@Override
	public List<Vehiculo> selecVehiculo() {

		return (List<Vehiculo>)vehiculoRepositoryYY.findAll();
	}
	
	@Override
	public Vehiculo update(VehiculoDTO vehiculo) throws EntityNotFoundException {
		
		try {
			Vehiculo veh =  vehiculoRepositoryYY.findById(vehiculo.getIdPlaca()).orElse(null);
			if(veh!=null) {
				Vehiculo vehiculoToSave = new Vehiculo();
				vehiculoToSave.setIdPlaca(vehiculo.getIdPlaca());
				vehiculoToSave.setMarca(vehiculo.getMarca());
				vehiculoToSave.setAnio(vehiculo.getAnio());
				vehiculoToSave.setVelocidad(vehiculo.getVelocidad());
				vehiculoToSave.setColor(vehiculo.getColor());
				vehiculoToSave.setNeumaticos(vehiculo.getNeumaticos());
				vehiculoToSave.setAsientos(vehiculo.getAsientos());
				vehiculoToSave.setPeso(vehiculo.getPeso());
				return vehiculoRepositoryYY.save(vehiculoToSave);
			}

		}catch(Exception ex)
		{
			System.out.println("****ERROR: " + ex.toString());
			  throw new EntityNotFoundException();
		}
		return null;
	}


}
