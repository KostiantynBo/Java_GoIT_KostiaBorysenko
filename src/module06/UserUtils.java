package module06;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        int end = users.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (users[i].equals(users[j])) {
                    users[j] = users[end-1];
                    end--;
                    j--;
                }
            }
        }

        User[] result = new User[end];
        System.arraycopy(users, 0, result, 0, end);
        return result;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {

        User[] temp = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                temp[i] = users[i];
                count++;
            }
        }

        User[] result = new User[count];
        int i = 0;
        for (int j = 0; j < temp.length; j++) {
            if (!(temp[j] == null)) {
                result[i] = temp[j];
                i++;
            }
        }

        //System.arraycopy(temp,0,result,0,result.length); этим способом не получается не могу понять почему.

        return result;
    }

    public final static User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            int newBalance = users[i].getBalance() + users[i].getSalary();
            users[i].setBalance(newBalance);
        }
        return users;
    }

    public final static long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();
        }
        return usersId;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        User[] temp = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (!(users[i] == null)) {
                temp[i] = users[i];
                count++;
            }
        }
        User[] result = new User[count];
        System.arraycopy(temp, 0, result, 0, result.length);

        return result;
    }
}

