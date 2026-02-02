package sn.edu.ept.git.dic2.HelloSpringBoot.exceptions;

import lombok.Getter;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Map;
@Getter
public class ApiException extends RuntimeException{

    private Integer status;
    private String message;
    private LocalDateTime date;

    private ApiException( Integer status, String message) {
        this.status = status;
        this.message = message;
        this.date = LocalDateTime.now();
    }

    public ResponseEntity<?> toResponseEntity(){
        return  ResponseEntity.status(status).body(Map.of("status", status,"date",date,"message",message));
    }

    public static ApiException of(Integer status, String message){
        return new ApiException( status,message);
    }
    
    
}
