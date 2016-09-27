package module05;

import com.sun.tools.javac.util.ArrayUtils;

public class Controller {

    private API apis[] = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String hotel, String city) {

        Room[] res1 = apis[0].findRooms(price, persons, hotel, city);
        Room[] res2 = apis[1].findRooms(price, persons, hotel, city);
        Room[] res3 = apis[2].findRooms(price, persons, hotel, city);
        Room[] result = new Room[res1.length + res2.length + res3.length];

        System.arraycopy(res1, 0, result, 0, res1.length);
        System.arraycopy(res2, 0, result, res1.length, res2.length);
        System.arraycopy(res3, 0, result, res1.length + res2.length, res3.length);


        DAOImpl dao = new DAOImpl();
        for (Room elements : result) dao.save(elements);
        return result;
    }


    public Room[] check(API api1, API api2) {

        Room[] res1 = api1.getAllRooms();
        Room[] res2 = api2.getAllRooms();

        int countRooms = 0;
        for (int i = 0; i < res1.length; i++) {
            for (int j = 0; j < res2.length; j++) {
                if (res1[i].equals(res2[j])) {
                    countRooms++;
                }
            }
        }

        Room[] checkRoom = new Room[countRooms];
        int k = 0;

        for (int i = 0; i < res1.length; i++) {
            for (int j = 0; j < res2.length; j++) {
                if (res1[i].equals(res2[j])) {
                    checkRoom[k] = res1[i];
                    k++;
                }
            }
        }
        return checkRoom;
    }

}
