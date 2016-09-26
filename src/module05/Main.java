package module05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //BookingComAPI api1 = new BookingComAPI();
        //System.out.println(Arrays.toString(api1.findRooms(10000, 2, "Fairmont Grand Hotel", "Kiev")));
        TripAdvisorAPI api2 = new TripAdvisorAPI();
        System.out.println(Arrays.toString(api2.findRooms(3400, 2, "Podol Plaza Hotel", "Kyiv")));



      /*  Controller controller = new Controller();

        controller.requestRooms(100, 2, "Krakow", "HolidayInn");
        controller.requestRooms(150, 1, "Kyiv", "Radison");
        controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        controller.check(new TripAdvisorAPI(), new GoogleAPI());
*/
    }
}
