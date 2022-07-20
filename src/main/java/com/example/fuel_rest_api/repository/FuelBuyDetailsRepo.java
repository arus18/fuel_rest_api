package com.example.fuel_rest_api.repository;

import com.example.fuel_rest_api.entities.FuelBuyDetails;
import org.springframework.data.repository.CrudRepository;

public interface FuelBuyDetailsRepo extends CrudRepository<FuelBuyDetails,Integer> {
}
