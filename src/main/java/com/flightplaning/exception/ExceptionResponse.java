package com.flightplaning.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Generated;

@Generated
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionResponse {
    @ApiModelProperty(
            name = "errorCode",
            value = "Related error code to the transaction",
            required = true
    )
    private String errorCode;
    @ApiModelProperty(
            name = "errorDescription",
            value = "Related error description to transaction",
            required = true
    )
    private String errorDescription;

    public ExceptionResponse() {
    }

    public ExceptionResponse(String errorCode, String errorDescription) {
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }
}
