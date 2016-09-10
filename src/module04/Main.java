package module04;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank (1,"USA", Currency.USD, 100, 100, 1, 100000000);
        Bank euBank = new EUBank(2,"Europa", Currency.EUR, 90, 90, 2, 10000000);
        Bank chinaBank = new ChinaBank(3,"China", Currency.USD, 80, 80, 3, 100000);

        User user1 = new User();
        user1.setName("Joni");
        user1.setBank(usBank);
        user1.setBalance(5000);
        user1.setSalary(100);

        User user2 = new User();
        user2.setName("Jack");
        user2.setBank(usBank);
        user2.setBalance(10000);
        user2.setSalary(200);

        User user3 = new User();
        user3.setName("Peter");
        user3.setBank(euBank);
        user3.setBalance(700);
        user3.setSalary(20);

        User user4 = new User();
        user4.setName("Greg");
        user4.setBank(euBank);
        user4.setBalance(1100);
        user4.setSalary(40);

        User user5 = new User();
        user5.setName("Meizu");
        user5.setBank(chinaBank);
        user5.setBalance(50);
        user5.setSalary(2);

        User user6 = new User();
        user6.setName("Xiaomi");
        user6.setBank(chinaBank);
        user6.setBalance(70);
        user6.setSalary(3);

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(user1,1100);
        bankSystem.fundUser(user1,900);
        bankSystem.transferMoney(user1,user2, 500);
        bankSystem.paySalary(user1);

        System.out.println(user1);


        bankSystem.withdrawOfUser(user2,1100);
        bankSystem.fundUser(user2,200);
        bankSystem.transferMoney(user2,user1, 500);
        bankSystem.paySalary(user2);

        System.out.println(user2);

        bankSystem.withdrawOfUser(user3,1001);
        bankSystem.fundUser(user3,2000);
        bankSystem.transferMoney(user3,user4,1100);
        bankSystem.paySalary(user3);

        System.out.println(user3);


        bankSystem.withdrawOfUser(user4,800);
        bankSystem.fundUser(user4,100);
        bankSystem.transferMoney(user4,user3, 110);
        bankSystem.paySalary(user4);

        System.out.println(user4);

        bankSystem.withdrawOfUser(user5,12);
        bankSystem.fundUser(user5,100000000);
        bankSystem.transferMoney(user5,user6,100000);
        bankSystem.paySalary(user5);

        System.out.println(user5);

        bankSystem.withdrawOfUser(user6,40);
        bankSystem.fundUser(user6,100000000);
        bankSystem.transferMoney(user6,user6, 100000);
        bankSystem.paySalary(user6);

        System.out.println(user6);

    }
}
