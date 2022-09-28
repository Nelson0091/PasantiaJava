package com.pasantia.application.service.impl;

import com.pasantia.application.repository.ProveedorRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pasantia.application.dto.ProveedorDTO;
import com.pasantia.application.entity.Proveedor;
import com.pasantia.application.service.ProveedorService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProveedorServiceImpl<T> implements ProveedorService {
	@Autowired
	private ProveedorRepository proveedorRepositoryYY;
	
	@Override
	public Proveedor create(ProveedorDTO proveedor) {
		try {
			Date fecha = new Date();
			Proveedor proveedorToSave = new Proveedor();
			proveedorToSave.setNombre(proveedor.getNombre());
			proveedorToSave.setTelefono(proveedor.getTelefono());
			proveedorToSave.setEmail(proveedor.getEmail());
			proveedorToSave.setDireccion(proveedor.getDireccion());
			proveedorToSave.setFechaCreacion(new Date());
			return proveedorRepositoryYY.save(proveedorToSave);
		}catch(Exception ex)
		{
			System.out.println("****ERROR: " + ex.toString());
			return null;
		}
	}

	@Override
	public Proveedor obtenerProveedo(Long id) {
		
		
		return  proveedorRepositoryYY.findById(id).orElse(null);
	}

	@Override
	public List<Proveedor> selecProveedor() {

		return (List<Proveedor>)proveedorRepositoryYY.findAll();
	}

	@Override
	public Proveedor update(ProveedorDTO proveedor) throws EntityNotFoundException {
		
		try {
			Proveedor prov =  proveedorRepositoryYY.findById(proveedor.getIdProveedor()).orElse(null);
			if(prov!=null) {
				Proveedor proveedorToSave = new Proveedor();
				proveedorToSave.setIdProveedor(proveedor.getIdProveedor());
				proveedorToSave.setNombre(proveedor.getNombre());
				proveedorToSave.setTelefono(proveedor.getTelefono());
				proveedorToSave.setEmail(proveedor.getEmail());
				proveedorToSave.setDireccion(proveedor.getDireccion());
				proveedorToSave.setFechaModificacion(new Date());
				proveedorToSave.setFechaCreacion(prov.getFechaCreacion());
				return proveedorRepositoryYY.save(proveedorToSave);
			}

		}catch(Exception ex)
		{
			System.out.println("****ERROR: " + ex.toString());
			  throw new EntityNotFoundException();
		}
		return null;
	}

}
