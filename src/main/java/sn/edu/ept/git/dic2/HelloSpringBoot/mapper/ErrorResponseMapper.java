package sn.edu.ept.git.dic2.HelloSpringBoot.mapper;

import sn.edu.ept.git.dic2.HelloSpringBoot.dto.ErrorResponse;
import sn.edu.ept.git.dic2.HelloSpringBoot.exceptions.ApiException;

public class ErrorResponseMapper {

    public static ErrorResponse from(ApiException apiException){
        return new ErrorResponse(apiException.getStatus(),apiException.getMessage());
    }
}
