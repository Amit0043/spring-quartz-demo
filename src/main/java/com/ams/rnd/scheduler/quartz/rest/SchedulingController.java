package com.ams.rnd.scheduler.quartz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulingController {
    @GetMapping
    public String getSchedulings(){
        return "test";
    }
}
