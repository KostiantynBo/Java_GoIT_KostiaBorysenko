package module05;

import java.util.Date;

public class TripAdvisorAPI implements API{
    private int count;
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(11, 2200, 1, "Podol Plaza Hotel", "Kyiv");
        rooms[1] = new Room(12, 3100, 2, "Podol Plaza Hotel", "Kyiv");
        rooms[2] = new Room(13, 3400, 2, "Podol Plaza Hotel", "Kyiv");
        rooms[3] = new Room(14, 3400, 2, "Podol Plaza Hotel", "Kyiv");
        rooms[4] = new Room(15, 3900, 4, "Podol Plaza Hotel", "Kyiv");
    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        Room[] findRooms = new Room[5];
        int j=0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price
                    && rooms[i].getPersons() == persons
                    && rooms[i].getCityName().equals(city)
                    && rooms[i].getHotelName().equals(hotel)) {
                findRooms[j] = rooms[i];
                count++;
                j++;
            }
        }
        Room[] findRoomsCut = new Room[count];
        /*int i=0;
        for (int j = 0; j < findRooms.length; j++) {
            if (!(findRooms[j] == null)) {
                findRoomsCut[i] = findRooms[j];
                i++;
            }
        } */
        System.arraycopy(findRooms,0,findRoomsCut,0,findRoomsCut.length);
        return findRoomsCut;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
