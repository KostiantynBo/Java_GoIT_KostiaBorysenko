package module07;

import java.util.*;
import java.util.stream.Collectors;

import static module07.Currency.UAH;
import static module07.Currency.USD;

public class Main {

    public static void main(String[] args) {

        //Create Main class where you create 10 Orders with 10 Users and put it to the List

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
        Order order9 = new Order(109, 2500, USD, "item9", "Shop9", user9);
        Order order10 = new Order(1010, 2000, UAH, "item10", "Shop10", user10);

        List<Order> listOfOrder = new ArrayList<>();

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

        //sort list by Order price in decrease order

        Comparator<Order> comparatorPrice = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };

        listOfOrder.sort(comparatorPrice);
        System.out.println("Sort by price: ");
        System.out.println(listOfOrder);

        //sort list by Order price in increase order AND User city

        Comparator<Order> comparatorPriceAndCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res = o1.getPrice() - o2.getPrice();
                if (res == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return res;
            }
        };

        listOfOrder.sort(comparatorPriceAndCity);
        System.out.println("Sort by price and city: ");
        System.out.println(listOfOrder);

        //sort list by Order itemName AND ShopIdentificator AND User city

        Comparator<Order> comparatorItemNameAndShopIdentificatorAndCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res1 = o1.getItemName().compareTo(o2.getItemName());
                if (res1 == 0) {
                    int res2 = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    if (res2 == 0) {
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                    return res2;
                }
                return res1;
            }
        };
        listOfOrder.sort(comparatorItemNameAndShopIdentificatorAndCity);
        System.out.println("Sort by itemName, shopIdentificator and city: ");
        System.out.println(listOfOrder);

        // delete duplicates from the list

        //Stream version

        listOfOrder = listOfOrder.stream().distinct().collect(Collectors.toList());

        System.out.println("ListOfOrder without dublicates: ");
        System.out.println(listOfOrder);

        // Копирование всех элементов ArrayList к LinkedHashSet. LinkedHashSet  - удаляет дубликаты и поддерживает порядок вставки.

        /*
        LinkedHashSet<Order> listOfOrderTemp = new LinkedHashSet<Order>();

        listOfOrderTemp.addAll(listOfOrder);

        listOfOrder.clear();

        listOfOrder.addAll(listOfOrderTemp);

        System.out.println("ListOfOrder without dublicates: " + listOfOrder);
        */

        //delete items where price less than 1500

        Iterator<Order> iterator = listOfOrder.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getPrice() < 1500) {
                iterator.remove();
            }
        }

        System.out.println("Price more than 1500: ");
        System.out.println(listOfOrder);

        // separate list for two list - orders in USD and UAH

        List<Order> ordersInUSD = new ArrayList<>();
        List<Order> ordersInUAH = new ArrayList<>();

        Iterator<Order> iterator1 = listOfOrder.iterator();
        while (iterator1.hasNext()) {
            Order order = iterator1.next();
            if (order.getCurrency() == UAH) {
                ordersInUAH.add(order);
            } else {
                ordersInUSD.add(order);
            }
        }
        System.out.println("Orders in UAH: ");
        System.out.println(ordersInUAH);
        System.out.println("Orders in USD: ");
        System.out.println(ordersInUSD);

        // separate list for as many lists as many unique cities are in User

    }

}
