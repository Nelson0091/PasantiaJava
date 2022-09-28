package com.pasantia.application.service;

import java.util.List;
import java.util.Optional;

import com.pasantia.application.dto.ViajeDTO;
import com.pasantia.application.entity.Viaje;

public interface ViajeService {
	
	public Viaje create(ViajeDTO viaje);
	public Viaje  obtenerViaje(Long id);
	public List<Viaje> selectViaje();
	public Viaje update(ViajeDTO viaje);

}
