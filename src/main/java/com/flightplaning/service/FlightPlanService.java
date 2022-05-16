/**
 *
 */
package com.flightplaning.service;


import com.flightplaning.entity.FlightPlan;
import com.flightplaning.model.FlightPlanRequest;

import java.util.List;

public interface FlightPlanService {
    public void saveFlightPlan(FlightPlanRequest flightPlan) throws Exception;

    public FlightPlan getFlightPlanByFlightId(Long flightId);

    public List<FlightPlan> getAllFlights();

    public void removeFlightPlan(Long flightId);

}
