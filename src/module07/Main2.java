package module07;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static module07.Currency.UAH;
import static module07.Currency.USD;

public class Main2 {
    public static void main(String[] args) {
        // Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet.
        // You should create 8 unique and two duplicated Orders
        User user1 = new User(1, "firstName1", "lastName1", "Kiev", 100);
        User user2 = new User(2, "firstName2", "lastName2", "Kiev", 200);
        User user3 = new User(3, "firstName3", "lastName3", "Kiev", 300);
        User user4 = new User(4, "firstName4", "lastName4", "Kiev", 400);
        User user5 = new User(5, "firstName5", "lastName5", "Kiev", 500);
        User user6 = new User(6, "firstName6", "lastName6", "Kiev", 600);
        User user7 = new User(7, "firstName7", "lastName7", "Kiev", 700);
        User user8 = new User(8, "firstName8", "lastName8", "Kiev", 800);
        User user9 = new User(9, "firstName9", "lastName9", "Kiev", 900);
        User user10 = new User(10, "firstName10", "lastName10", "Kiev", 1000);

        Order order1 = new Order(101, 10, USD, "item1", "Shop1", user1);
        Order order2 = new Order(102, 20, UAH, "item2", "Shop2", user2);
        Order order3 = new Order(103, 30, USD, "item3", "Shop3", user3);
        Order order4 = new Order(104, 40, UAH, "item4", "Shop4", user4);
        Order order5 = new Order(105, 50, USD, "item5", "Shop5", user5);
        Order order6 = new Order(106, 60, UAH, "item6", "Shop6", user6);
        Order order7 = new Order(107, 70, USD, "item7", "Shop7", user7);
        Order order8 = new Order(108, 1500, UAH, "item8", "Shop8", user8);
        Order order9 = new Order(1010, 2000, UAH, "item10", "Shop10", user10);
        Order order10 = new Order(1010, 2000, UAH, "item10", "Shop10", user10);

        Set<Order> listOfOrder = new TreeSet<>();

        listOfOrder.add(order1);
        listOfOrder.add(order2);
        listOfOrder.add(order3);
        listOfOrder.add(order4);
        listOfOrder.add(order5);
        listOfOrder.add(order6);
        listOfOrder.add(order7);
        listOfOrder.add(order8);
        listOfOrder.add(order9);
        listOfOrder.add(order10);

        // check if set contain Order where User’s lastName is - “Petrov”

        Iterator<Order> iterator;
        iterator = listOfOrder.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println("Set contain Order where User’s lastName is - “Petrov”.");
            }
        }

        // print Order with largest price using only one set method - get

        Set<Order> listTemp = new TreeSet<>();
        listTemp.addAll(listOfOrder);
        int i = 0;
        for (Order ord : listOfOrder) {
            if (ord.getPrice() > i) i = ord.getPrice();
        }
        Iterator<Order> iterator3 = listTemp.iterator();
        while (iterator3.hasNext()) {
            if (iterator3.next().getPrice() < i) {
                iterator3.remove();
            }
        }
        System.out.println(listTemp);

        // delete orders where currency is USD using Iterator

        Iterator<Order> iterator4 = listOfOrder.iterator();
        while (iterator4.hasNext()) {
            Order order = iterator4.next();
            if (order.getCurrency() == USD) {
                iterator4.remove();
            }
        }

        System.out.println("Only orders where currency is UAH: ");
        System.out.println(listOfOrder);

    }
}
