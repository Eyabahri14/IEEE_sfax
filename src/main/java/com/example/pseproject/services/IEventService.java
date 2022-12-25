package com.example.pseproject.services;

import com.example.pseproject.entities.Event;

import java.util.List;

public interface IEventService {

    public List<Event> retrieveAllEvents();
    public Event retrieveEventById(Long id);
    public Event addEvent(Event e);
    Event updateEvent(Event Event);
    String deleteEvent(Long id);
}
