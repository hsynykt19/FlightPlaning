/**
 * 
 */
package com.flightplaning.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.time.LocalDateTime;


@Data
@ApiModel
public class FlightPlanRequest {
	@ApiModelProperty(name="departureAirportCode", value="departureAirportCode", required = true)
	@NotNull
	private String departureAirportCode;//kalkisKonum
	@ApiModelProperty(name="arrivalAirportCode", value="arrivalAirportCode", required = true)
	@NotNull
	private String arrivalAirportCode;//varisKonum
	@ApiModelProperty(name="departureDate", value="departureDate", required = true)
	@NotNull
	private LocalDateTime departureDate;//kalkisDATE
	@ApiModelProperty(name="arrivalDate", value="arrivalDate", required = true)
	@NotNull
	private LocalDateTime arrivalDate;//VarisDate
	@ApiModelProperty(name="airplaneName", value="airplaneName", required = true)
	@NotNull
	private String planeName;

}
