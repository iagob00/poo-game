package events.observer;
import java.util.ArrayList;
import java.util.List;

public class ScoreSystem implements GameObserver {
    private List<String> events = new ArrayList<>();

    @Override
    public void update(String event) {
        events.add(event); 
    }

    public List<String> getEvents() {
        return events;
    }
}