package sn.edu.ept.git.dic2.HelloSpringBoot.dto;

import java.time.LocalDateTime;

public record ErrorResponse (Integer status, String message, LocalDateTime date ) {
    public ErrorResponse {

    }

    public ErrorResponse(Integer status, String message) {
        this(status, message, LocalDateTime.now());
    }
}
