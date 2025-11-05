package com.cinemaabyss.events;

import com.cinemaabyss.events.dto.UserEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.OffsetDateTime;

@SpringBootApplication
public class EventsApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(EventsApplication.class, args);
    }

}
