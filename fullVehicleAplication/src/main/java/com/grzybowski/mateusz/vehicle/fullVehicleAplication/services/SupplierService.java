package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Supplier;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
	
	public List<Supplier> findAll(){
		return supplierRepository.findAll();
	}	


}
