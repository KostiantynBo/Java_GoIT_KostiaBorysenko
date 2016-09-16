package module05;

import java.util.Date;

public class TripAdvisorAPI implements API{
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(11, 2200, 1, new Date(20160914), "Podol Plaza Hotel", "Kyiv");
        rooms[1] = new Room(12, 3100, 2, new Date(20160914), "Podol Plaza Hotel", "Kyiv");
        rooms[2] = new Room(13, 3400, 2, new Date(20160914), "Podol Plaza Hotel", "Kyiv");
        rooms[3] = new Room(14, 3400, 2, new Date(20160914), "Podol Plaza Hotel", "Kyiv");
        rooms[4] = new Room(15, 3900, 4, new Date(20160914), "Podol Plaza Hotel", "Kyiv");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        return new Room[0];
    }


}
