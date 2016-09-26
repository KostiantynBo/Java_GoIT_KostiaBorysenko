package module05;

public class BookingComAPI implements API {

    private int count;
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(6, 8591, 1, "Fairmont Grand Hotel", "Kiev");
        rooms[1] = new Room(7, 10000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[2] = new Room(8, 20000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[3] = new Room(9, 10000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[4] = new Room(10, 25000, 4, "Fairmont Grand Hotel", "Kiev");
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
