package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entities.AirlinesModel;

public interface AirlinesRepo extends JpaRepository<AirlinesModel, Integer> {

}
