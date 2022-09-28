package com.pasantia.application.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pasantia.application.dto.ViajeDTO;
import com.pasantia.application.entity.Viaje;
import com.pasantia.application.repository.ViajeRepository;
import com.pasantia.application.service.ViajeService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service

public class ViajeServiceImpl<T> implements ViajeService {
	
	@Autowired
	private ViajeRepository viajeRepositoryYY;
	
	@Override
	public Viaje create(ViajeDTO viaje) {
		try {
			Viaje viajeToSave = new Viaje();
			// el costo de boleto es $50 por la cantidad de personas
			viajeToSave.setCostoboleto(viaje.getNumpasajeros()*50);
			viajeToSave.setNumpasajeros(viaje.getNumpasajeros());
			viajeToSave.setPesototal(viaje.getPesototal());
			viajeToSave.setFechaviaje(viaje.getFechaviaje());
			viajeToSave.setDestino(viaje.getDestino());
			viajeToSave.setPreciopersona(viaje.getPreciopersona());
			// el costo por kg para el equipaje son $30
			viajeToSave.setPreciokgequipaje(viaje.getPesototal()*30);
			
			return viajeRepositoryYY.save(viajeToSave);
		}catch(Exception ex)
		{
			System.out.println("****ERROR: " + ex.toString());
			return null;
		}
		
	}
	
	@Override
	public Viaje obtenerViaje(Long id) {
		
		
		return  viajeRepositoryYY.findById(id).orElse(null);
	}
	
	@Override
	public List<Viaje> selectViaje() {

		return (List<Viaje>)viajeRepositoryYY.findAll();
	}
	
	@Override
	public Viaje update(ViajeDTO viaje) throws EntityNotFoundException {
		
		try {
			Viaje via =  viajeRepositoryYY.findById(viaje.getIdViaje()).orElse(null);
			if(via!=null) {
				Viaje viajeToSave = new Viaje();
				viajeToSave.setIdViaje(viaje.getIdViaje());
				viajeToSave.setCostoboleto(viaje.getCostoboleto());
				viajeToSave.setNumpasajeros(viaje.getNumpasajeros());
				viajeToSave.setPesototal(viaje.getPesototal());
				viajeToSave.setFechaviaje(viaje.getFechaviaje());
				viajeToSave.setDestino(viaje.getDestino());
				viajeToSave.setPreciopersona(viaje.getPreciopersona());
				viajeToSave.setPreciokgequipaje(viaje.getPreciokgequipaje());
			}

		}catch(Exception ex)
		{
			System.out.println("****ERROR: " + ex.toString());
			  throw new EntityNotFoundException();
		}
		return null;
	}

}
