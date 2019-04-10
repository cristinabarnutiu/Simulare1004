package Service;

import Domain.Event;
import Repository.EventRepository;

import java.util.List;

public class EventService {
    private EventRepository repository;

    @Override
    public String toString() {
        return "EventService{" +
                "repository=" + repository +
                '}';
    }

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public void insert(String id, String description, String date, int duration, int startTime) {

        for (Event e : repository.getAll()) {

            if (e.getId().equals(id)) {
                throw new RuntimeException("The id is already used!");
            }
        }

        Event event = new Event(id, description, date, duration, startTime);
        repository.insert(event);
    }

    public List<Event> getAll() {
        return repository.getAll();
    }

}