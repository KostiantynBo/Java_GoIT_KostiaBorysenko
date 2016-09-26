package module05;

public class BookingComAPI implements API {
    private int count;
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(6, 8591, 1, "Fairmont Grand Hotel", "Kiev");
        rooms[1] = new Room(7, 10000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[2] = new Room(8, 10000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[3] = new Room(9, 15000, 2, "Fairmont Grand Hotel", "Kiev");
        rooms[4] = new Room(10, 25000, 4, "Fairmont Grand Hotel", "Kiev");
    }
    @Override
    public int counterRooms(Room room) {
        for (int i = 0; i < rooms.length; i++)
            if (rooms[i].equals(room)) {
                count++;
            } else {
                System.out.println("No room was found");
            }
        return count;
    }
    @Override
    public Room[] findRooms(Room room) {
        for (int i = 0; i < rooms.length; i++)
            if (rooms[i].equals(room)) {
                rooms[i]=room;
            }
        return new Room[count];
    }


}
