package com.example.restservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.Businesscard;
import com.example.restservice.service.AllServices;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Controller for Lyon service
 */
@RestController
public class LyonServicesController {
	private final AllServices allServices = new AllServices();

	private final AtomicLong counter = new AtomicLong();

	//greeting message
	@GetMapping("/lyon")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Greeting from Lyon Services....!";
	}

	//service one
	@GetMapping("/lyon/getById")
	public Businesscard getById(@RequestParam(value = "icd") String icd,
								@RequestParam(value = "enterpriseNumber") String enterpriseNumber) {
		return allServices.getById(icd,enterpriseNumber);
	}

	//service two
	@GetMapping("/lyon/searchByName")
	public List<Businesscard> searchByName(@RequestParam(name = "name") String name) {
		return allServices.searchByName(name);
	}

	//service three
	@GetMapping("/lyon/getByName")
	public Businesscard getByName(@RequestParam(name = "name") String name) {
		return allServices.getByName(name);
	}
}
