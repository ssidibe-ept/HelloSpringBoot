package sn.edu.ept.git.dic2.HelloSpringBoot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sn.edu.ept.git.dic2.HelloSpringBoot.dto.ErrorResponse;
import sn.edu.ept.git.dic2.HelloSpringBoot.mapper.ErrorResponseMapper;

import java.util.Map;

@RestControllerAdvice
public class PersonalizedExceptionHandler {


    @ExceptionHandler(ApiException.class)
    public ResponseEntity handleException(ApiException apiException) {
        ErrorResponse err = ErrorResponseMapper.from(apiException);
        return ResponseEntity.status(apiException.getStatus()).body(err);
    }
}
