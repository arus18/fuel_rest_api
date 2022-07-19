package com.example.fuel_rest_api.controller.fuel_controller;
import com.example.fuel_rest_api.fuel_buy_details.FuelBuyDetails;
import com.example.fuel_rest_api.fuel_buy_details.FuelBuyDetailsRepo;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuelController {

    @Autowired
    FuelBuyDetailsRepo fuelBuyDetailsRepo;

    @PostMapping("new_buy")
    public FuelBuyDetails new_buy(@RequestBody FuelBuyDetails fuelBuyDetails){//create new record
        return fuelBuyDetailsRepo.save(fuelBuyDetails);
    }

    @GetMapping("get_buy_details")
    public List<FuelBuyDetails> getBuyDetails(){//get all details
        return IteratorUtils.toList(fuelBuyDetailsRepo.findAll().iterator());
    }
}
