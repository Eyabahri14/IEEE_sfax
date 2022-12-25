package com.example.pseproject.services;

import com.example.pseproject.entities.Event;
import com.example.pseproject.repositories.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EventServiceImpl implements IEventService{
    @Autowired
    EventRepository eventRepository;

    @Override
    public List<Event> retrieveAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event retrieveEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public Event addEvent(Event e) {
        return eventRepository.save(e);
    }

    @Override
    public Event updateEvent(Event Event) {
        Event existingEvent = eventRepository.findById(Event.getIdEvenement()).orElse(null);
        existingEvent.setTitreEv(Event.getTitreEv());
        existingEvent.setDescriptionEv(Event.getDescriptionEv());
        existingEvent.setImageEv(Event.getImageEv());
        existingEvent.setDateEv(Event.getDateEv());
        existingEvent.setLieu(Event.getLieu());

        return eventRepository.save(existingEvent);
    }

    @Override
    public String deleteEvent(Long id) {
        eventRepository.deleteById(id);
        return "event removed !! " + id;
    }
}
