package module05;

public class Main {
    public static void main(String[] args) {

        Room orderRoom = new Room(8591,1,"Fairmont Grand Hotel", "Kiev" );


        Controller controller = new Controller();

        controller.requestRooms(100, 2, "Krakow", "HolidayInn");
        controller.requestRooms(150, 1, "Kyiv", "Radison");
        controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        controller.check(new TripAdvisorAPI(), new GoogleAPI());

    }
}
