package com.example.pseproject.controllers;

import com.example.pseproject.entities.Event;
import com.example.pseproject.services.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    IEventService service;

    //the get methods
    @GetMapping("/Event")
    public List<Event> retrieveAllEvents() {
        return service.retrieveAllEvents();
    }

    @GetMapping("/EventsById/{id}")
    public Event retrieveEventById(@PathVariable Long id)
    {
        return service.retrieveEventById(id);
    }

    //the push methods

    @PostMapping("/addEvent")
    @ResponseBody
    public Event addEvent(@RequestBody Event b) {
        return service.addEvent(b);
    }

    //the update method
    @PutMapping("/updateEvent")
    public Event updateEvent(@RequestBody Event Event) {
        return service.updateEvent(Event);
    }

    //the remove method
    @DeleteMapping("/deleteEvent/{id}")
    public String deleteEvent(@PathVariable long id) {
        return service.deleteEvent(id);
    }



}
