package module06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User [] users = new User[5];
        users[0]= new User(1,"A","A1",1,10);
        users[1]= new User(2,"B","B1",2,20);
        users[2]= new User(1,"A","A1",1,10);
        users[3]= new User(4,"D","D1",4,40);
        users[4]= new User(1,"A","A1",1,10);

        //System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(users,10)));
        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        //System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
        //System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
       //System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));


    }
}
