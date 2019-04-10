package Repository;

import Domain.Event;
import Domain.EventValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventRepository {

    private Map<String, Event> storage = new HashMap<>();
    private EventValidator validator;

    public EventRepository(Map<String, Event> storage, EventValidator validator) {
        this.storage = storage;
        this.validator = validator;
    }

    public EventRepository(EventValidator eventValidator) {
    }


    public void insert(Event event) {
        if (storage.containsKey(event.getId())) {
            throw new RuntimeException(String.format("There already is an event with id=%s", event.getId()));
        }
        validator.validate(event);
        storage.put(event.getId(), event);
    }

    public List<Event> getAll() {
        return new ArrayList<>(storage.values());
    }
}