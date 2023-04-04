package com.talkhours.chatservice.Configurations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.talkhours.chatservice.Messages.Reponses.ResponseMessage;


@RestControllerAdvice
public class GetException {
    @ExceptionHandler({Exception.class})
    ResponseEntity<?> traiterException(Exception e){
        return  ResponseMessage.generateResponse("Exeption recuperée par le class GetException", HttpStatus.EXPECTATION_FAILED, e.getMessage());
    }
}
