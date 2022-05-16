/*
 * Copyright (c) 2012-
 * Vodafone Teknoloji Hizmetleri A.S., Istanbul, Turkey
 *
 * All rights reserved. This Software or any portion of it can not be translated,
 * distributed, sold, adapted, arranged, used, copied, modified, de-compiled,
 * reverse assembled or otherwise reverse engineered, disassembled, replaced or made
 * additions to and to be reproduced in whole or in part, in any way, manner or form.
 */

package com.flightplaning.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;


@RestControllerAdvice
@Component
public class FlightPlaningExceptionHandler {

    private static Logger log = LoggerFactory.getLogger(FlightPlaningExceptionHandler.class);


    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = IllegalArgumentException.class)
    public ExceptionResponse getException(IllegalArgumentException ex) {
        log.error("IllegalArgumentException : {}", ex);
        return new ExceptionResponse("99", "System Error");
    }




    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
    public void badRequestHandler(MethodArgumentTypeMismatchException ex, HttpServletRequest request) {
        log.error("MethodArgumentTypeMismatchException : {}", ex);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public void badRequestHandler(MethodArgumentNotValidException ex, HttpServletRequest request) {
        log.error("MethodArgumentTypeMismatchException : {}", ex);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NullPointerException.class)
    public ExceptionResponse nullPointerExceptionHandler(NullPointerException ex) {
        log.error("NullPointerException : {}", ex);
        return new ExceptionResponse("99", "System Error");
    }
    

}

