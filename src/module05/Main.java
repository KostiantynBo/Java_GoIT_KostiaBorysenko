package module05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //BookingComAPI api1 = new BookingComAPI();
        //System.out.println(Arrays.toString(api1.findRooms(10000, 2, "Fairmont Grand Hotel", "Kiev")));
        //TripAdvisorAPI api2 = new TripAdvisorAPI();
        //System.out.println(Arrays.toString(api2.findRooms(3400, 2, "Podol Plaza Hotel", "Kyiv")));
        //GoogleAPI api3 = new GoogleAPI();
        //System.out.println(Arrays.toString(api3.findRooms(2500, 2, "IBIS Киев Центр", "Kiev")));




        Controller controller = new Controller();

        controller.requestRooms(10000, 2, "Fairmont Grand Hotel", "Kiev");
        controller.requestRooms(3400, 2, "Podol Plaza Hotel", "Kyiv");
        controller.requestRooms(2500, 2, "IBIS Киев Центр", "Kiev");


        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        controller.check(new TripAdvisorAPI(), new GoogleAPI());

    }
}
