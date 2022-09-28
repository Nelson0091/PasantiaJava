package com.pasantia.application.service;

import java.util.List;
import java.util.Optional;

import com.pasantia.application.dto.VehiculoDTO;
import com.pasantia.application.entity.Vehiculo;

public interface VehiculoService {
	
	public Vehiculo create(VehiculoDTO vehiculo);
	public Vehiculo  obtenerVehiculo(Long id);
	public List<Vehiculo> selecVehiculo();
	public Vehiculo update(VehiculoDTO vehiculo);
	

}
