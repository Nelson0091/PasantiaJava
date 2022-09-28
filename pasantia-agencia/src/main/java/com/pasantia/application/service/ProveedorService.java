package com.pasantia.application.service;

import java.util.List;
import java.util.Optional;

import com.pasantia.application.dto.ProveedorDTO;
import com.pasantia.application.entity.Proveedor;

public interface ProveedorService {

	public Proveedor create(ProveedorDTO proveedor);
	public Proveedor  obtenerProveedo(Long id);
	public List<Proveedor> selecProveedor();
	public Proveedor update(ProveedorDTO proveedor);
}
