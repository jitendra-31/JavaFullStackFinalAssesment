package com.shop.management.service.shopManagementService.exceptionHandling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {


    // for not found
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponse> exceptionMovieHandler(Exception e){

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(e.getMessage());

        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
    }




    // Any Bad Request Exception (CUSTOM ERROR MESSAGE)
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> exceptionHandlerBadRequest(Exception e){

        ErrorResponse errorResponse = new ErrorResponse();

        errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(e.getMessage());

        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    // any other bad request
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception e){

        ErrorResponse errorResponse = new ErrorResponse();

        errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage("THE REQUEST CANNOT BE PLACED DUE TO MALFUNCTION SYNTAX, INVALID REQUEST MESSAGE FRAMING, OR DECEPTIVE REQUEST ROUTING");

        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }

}
