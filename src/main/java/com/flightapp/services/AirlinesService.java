package com.flightapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entities.AirlinesModel;
import com.flightapp.repository.AirlinesRepo;

@Service
public class AirlinesService {
	
	@Autowired
	AirlinesRepo repo;

	public AirlinesModel createFlight(AirlinesModel model) {
		// TODO Auto-generated method stub
		return repo.save(model);
	}

	public AirlinesModel editFlight(AirlinesModel model) {
		// TODO Auto-generated method stub
		return repo.save(model);
	}

	public List<AirlinesModel> getFlights() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
