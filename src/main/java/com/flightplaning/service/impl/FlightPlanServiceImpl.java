/**
 *
 */
package com.flightplaning.service.impl;


import com.flightplaning.entity.FlightPlan;
import com.flightplaning.exception.FlightPlanNotFoundException;
import com.flightplaning.model.FlightPlanRequest;
import com.flightplaning.repository.FlightPlanRepository;
import com.flightplaning.service.FlightPlanService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlightPlanServiceImpl implements FlightPlanService {


    private final FlightPlanRepository flightPlanRepository;

    public FlightPlanServiceImpl(FlightPlanRepository flightPlanRepository) {
        this.flightPlanRepository = flightPlanRepository;
    }

    @Override
    public void saveFlightPlan(FlightPlanRequest request) throws Exception {

        List<FlightPlan> flightPlans = flightPlanRepository.findByAirlineCodeDate(request.getArrivalAirportCode(), request.getDepartureAirportCode(), request.getDepartureDate().toLocalDate());


        if (flightPlans.size() < 3) {
            FlightPlan plan = new FlightPlan();
            plan.setDeparture_Airline_Code(request.getDepartureAirportCode());
            plan.setArrival_Airline_Code(request.getArrivalAirportCode());
            plan.setDeparture_Date(request.getDepartureDate());
            plan.setPlaneName(request.getPlaneName());
            plan.setArrival_Date(request.getArrivalDate());
            plan.setFlight_Date(request.getDepartureDate().toLocalDate());
            flightPlanRepository.save(plan);

        } else {
            throw new Exception("Error trying to findById the navaid with identifier ");
        }


    }

    @Override
    public FlightPlan getFlightPlanByFlightId(Long flightId) {
        FlightPlan flightPlan = flightPlanRepository.findById(flightId).orElseThrow(FlightPlanNotFoundException::new);
        return flightPlan;
    }

    @Override
    public List<FlightPlan> getAllFlights() {
        return flightPlanRepository.findAll();

    }

    @Override
    public void removeFlightPlan(Long flightId) {
        flightPlanRepository.deleteById(flightId);
    }


}
