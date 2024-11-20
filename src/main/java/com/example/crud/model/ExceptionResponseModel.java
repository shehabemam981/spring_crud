package com.example.crud.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Setter
@Getter

public class ExceptionResponseModel {
private HttpStatus status;
@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "YYYY-MM-DD HH-MM")
private LocalDateTime dateTime;
private BundleMessages message;

    public ExceptionResponseModel(HttpStatus status, BundleMessages message) {
        this.status = status;
        dateTime = LocalDateTime.now();
        this.message = message;
    }
}
