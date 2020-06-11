package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.VehicleStatus;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleStatusService {
	
	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;
	
	public List<VehicleStatus> findAll(){
		return vehicleStatusRepository.findAll();
	}	


}
