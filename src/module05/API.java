package module05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public interface API extends Collection<Room> {
    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);
    ArrayList<Room> getAllRooms();
}
