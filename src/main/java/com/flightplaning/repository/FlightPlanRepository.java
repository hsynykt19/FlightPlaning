/**
 * 
 */
package com.flightplaning.repository;

import com.flightplaning.entity.FlightPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface FlightPlanRepository extends JpaRepository<FlightPlan, Long>, JpaSpecificationExecutor<FlightPlan> {
    @Query(value = " select n from FlightPlan n WHERE n.arrival_Airline_Code IN (:arrivalAirportCode,:departureAirportCode)and n.departure_Airline_Code IN (:arrivalAirportCode,:departureAirportCode) and n.Flight_Date=:departureDate ")
    List<FlightPlan> findByAirlineCodeDate(String arrivalAirportCode, String departureAirportCode, LocalDate departureDate);
}
