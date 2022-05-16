/**
 * 
 */
package com.flightplaning.controller;

import com.flightplaning.entity.FlightPlan;
import com.flightplaning.exception.ExceptionResponse;
import com.flightplaning.model.FlightPlanRequest;
import com.flightplaning.service.FlightPlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Api
@RestController
public class FlightPlanController {

	@Autowired
	FlightPlanService flightPlanService;

	@ApiOperation(value = "/api/flightPlans")
	@PostMapping(value = "/api/flightPlans")
	public ResponseEntity<Object> saveFlightPlan(@RequestBody @Valid FlightPlanRequest flightPlanRequest) {

       ExceptionResponse response=new ExceptionResponse();
		try {
			flightPlanService.saveFlightPlan(flightPlanRequest);
			response.setErrorDescription("New Flight Plan saved.") ;
			response.setErrorCode("100");
		} catch (Exception e) {
			response.setErrorDescription("New Flight Plan not saved.") ;
			response.setErrorCode("99");

		}

		return new ResponseEntity<>(response, HttpStatus.OK);

	}
	@ApiOperation(value = "/api/flightPlans{id}")
	@GetMapping("/api/flightPlans{id}")
	public ResponseEntity<FlightPlan> getFlightPlanById(@PathVariable(name = "id") Long flightId) {



		FlightPlan  flightPlan= flightPlanService.getFlightPlanByFlightId(flightId);

//		map.put("flightPlan", flightPlan);
//		map.put("success", true);
//		map.put("message", "Returned Flight Plan OK.");

		return new ResponseEntity<>(flightPlan, HttpStatus.OK);

	}
	@ApiOperation(value = "/api/flightPlans")
	@GetMapping("/api/flightPlans")
	public ResponseEntity<List<FlightPlan>> getAllFlights() {

		Map<String, Object> map = new HashMap<>();

		List<FlightPlan> listFlights = flightPlanService.getAllFlights();

		map.put("flights", listFlights);
		map.put("success", true);
		map.put("message", "Returned all flights OK.");

		return new ResponseEntity<>(listFlights, HttpStatus.OK);

	}
	@ApiOperation(value = "/api/flightPlans{id}")
	@DeleteMapping("{id}")
	public Map<String, Object> removeFlightPlan(@PathVariable(name="id") Long flightId) {

		Map<String, Object> map = new HashMap<>();

		flightPlanService.removeFlightPlan(flightId);

		map.put("success", true);
		map.put("message", "Removed flight plan by id OK.");

		return map;

	}
}
