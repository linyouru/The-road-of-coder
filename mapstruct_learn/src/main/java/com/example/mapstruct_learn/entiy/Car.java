package com.example.mapstruct_learn.entiy;

import lombok.Data;

import java.util.Date;

@Data
public class Car {

    private String make;
    private int numberOfSeats;
    private String type;
    private Date createdTime;

}
