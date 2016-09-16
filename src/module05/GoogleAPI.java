package module05;

import java.util.Date;

public class GoogleAPI implements API{
    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(1, 1350, 1, new Date(20160914), "IBIS Киев Центр", "Kiev");
        rooms[1] = new Room(2, 1600, 2, new Date(20160914), "IBIS Киев Центр", "Kiev");
        rooms[2] = new Room(3, 2100, 2, new Date(20160914), "IBIS Киев Центр", "Kiev");
        rooms[3] = new Room(4, 2500, 2, new Date(20160914), "IBIS Киев Центр", "Kiev");
        rooms[4] = new Room(5, 3200, 4, new Date(20160914), "IBIS Киев Центр", "Kiev");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        return new Room[0];
    }

}
