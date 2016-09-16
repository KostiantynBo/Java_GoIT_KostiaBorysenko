package module05;

public class Controller implements API {

    private API apis[] = new API[3];

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        return null;
    }

    public Room[] check(API api1, API api2){
        return null;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
