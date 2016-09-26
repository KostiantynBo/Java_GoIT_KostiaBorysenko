package module05;

import java.util.Arrays;
import java.util.Date;



public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(6, 8591, 1, "Fairmont Grand Hotel", "Kiev");
        rooms[1] = new Room(7, 10000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[2] = new Room(8, 10000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[3] = new Room(9, 15000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[4] = new Room(10, 25000, 4, "Fairmont Grand Hotel", "Kiev");
    }

    @Override
    public Room[] findRooms(Room room) {
        int count = 0;
        for (int i=0; i < rooms.length; i++){
            if (rooms[i].equals(room)) {

            }

            count++;
        }
        return new Room[count];
    }
}
