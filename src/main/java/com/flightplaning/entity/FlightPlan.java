/**
 * 
 */
package com.flightplaning.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="flightsPlane")
public class FlightPlan {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private Long id;

	private String PlaneName;

	@NotNull
	private String departure_Airline_Code;

	@NotNull
	private String arrival_Airline_Code;

	@NotNull
	private LocalDateTime departure_Date;

	@NotNull
	private LocalDateTime arrival_Date;
	@NotNull
	private LocalDate Flight_Date;





}
