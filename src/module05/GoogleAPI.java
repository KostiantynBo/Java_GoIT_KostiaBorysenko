package module05;

import java.util.Date;

public class GoogleAPI implements API{
    private int count;
    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(1, 1350, 1, "IBIS Киев Центр", "Kiev");
        rooms[1] = new Room(2, 1600, 2, "IBIS Киев Центр", "Kiev");
        rooms[2] = new Room(3, 2100, 2, "IBIS Киев Центр", "Kiev");
        rooms[3] = new Room(4, 2500, 2, "IBIS Киев Центр", "Kiev");
        rooms[4] = new Room(5, 3200, 4, "IBIS Киев Центр", "Kiev");
    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        Room[] findRooms = new Room[5];
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
        return findRoomsCut;
    }
}
