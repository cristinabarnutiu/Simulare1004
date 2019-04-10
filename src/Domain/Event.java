package Domain;

import java.util.Objects;

public class Event {
    //Cerinte:
    //1. id, description, date, duration (minutes),startTime (ora de incepere)
    //2. startTime = unique in timpul unei zile
    //3. id must be unique
    //4. maxim per date (the event with the longest duration), date must be validated

    private String id;
    private String description;
    private String date; //format ddmmyyyy
    private int duration; //in minutes
    private int startTime; //format hhmm

    public Event(String id, String description, String date, int duration, int startTime) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.duration = duration;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", duration=" + duration +
                ", startTime=" + startTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return duration == event.duration &&
                startTime == event.startTime &&
                Objects.equals(id, event.id) &&
                Objects.equals(description, event.description) &&
                Objects.equals(date, event.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, date, duration, startTime);
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public int getDuration() { return duration; }

    public void setDuration(int duration) { this.duration = duration; }

    public int getStartTime() { return startTime; }

    public void setStartTime(int startTime) { this.startTime = startTime; }
}
