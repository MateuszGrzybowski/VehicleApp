package com.grzybowski.mateusz.vehicle.fullVehicleAplication.services;

import java.util.List;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Contact;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	public List<Contact> findAll(){
		return contactRepository.findAll();
	}	


}
