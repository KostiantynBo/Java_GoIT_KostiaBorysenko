package module05;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GoogleAPI implements API{
    private int count;
    //private Room[] rooms = new Room[5];
    private List<Room> rooms = new ArrayList<>();

    public GoogleAPI() {
        rooms.add(new Room(1, 1350, 1, "IBIS Киев Центр", "Kiev"));
        rooms.add(new Room(2, 2500, 2, "IBIS Киев Центр", "Kiev"));
        rooms.add(new Room(3, 2100, 2, "IBIS Киев Центр", "Kiev"));
        rooms.add(new Room(4, 2500, 2, "IBIS Киев Центр", "Kiev"));
        rooms.add(new Room(5, 3200, 4, "IBIS Киев Центр", "Kiev"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String hotel, String city) {
        /*Room[] findRooms = new Room[5];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price
                    && rooms[i].getPersons() == persons
                    && rooms[i].getCityName().equals(city)
                    && rooms[i].getHotelName().equals(hotel)) {
                findRooms[i] = rooms[i];
                count++;
            }
        }
        Room[] findRoomsCut = new Room[count];
        int i=0;
        for (int j = 0; j < findRooms.length; j++) {
            if (!(findRooms[j] == null)) {
                findRoomsCut[i] = findRooms[j];
                i++;
            }
        }
        //System.arraycopy(findRooms,0,findRoomsCut,0,findRoomsCut.length);
        return findRoomsCut;*/
        List<Room> findRoomsCut = new ArrayList<>();
        for (Room r : rooms) {
            if (r.getPrice() == price
                    && r.getPersons() == persons
                    && r.getCityName().equals(city)
                    && r.getHotelName().equals(hotel)) {
                findRoomsCut.add(r);
            }
        }
        return (ArrayList<Room>) findRoomsCut;
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        return (ArrayList<Room>) rooms;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Room> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Room room) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Room> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
