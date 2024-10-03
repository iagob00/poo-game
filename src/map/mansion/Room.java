package map.mansion;

import java.util.ArrayList;
import java.util.List;

class Room {
    private List<Room> rooms = new ArrayList<>();

    public void add(Room room) {
        rooms.add(room);
    }
}