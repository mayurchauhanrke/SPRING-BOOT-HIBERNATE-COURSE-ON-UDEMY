package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//here the CricketCoach is a class that implements Coach interface.
public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
