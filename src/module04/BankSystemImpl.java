package module04;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {

        Bank userBank = user.getBank();

        double withdrawal = amount + amount * userBank.getCommission(amount);

        if (userBank.getLimitOfWithdrawal() >= withdrawal) {
            double newBalance = user.getBalance() - withdrawal;
            user.setBalance(newBalance);
        } else {
            System.out.println("Transfer limit was exceeded");
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();

        if (userBank.getLimitOfFunding() >= amount) {
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
        } else {
            System.out.println("Transfer limit was exceeded");
        }


    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBank1 = fromUser.getBank();
        Bank userBank2 = toUser.getBank();

        double withdrawal = amount + amount * userBank1.getCommission(amount);

        if (userBank1.getLimitOfWithdrawal() >= withdrawal) {
            double newBalance = fromUser.getBalance() - withdrawal;
            fromUser.setBalance(newBalance);
        } else {
            System.out.println("Transfer limit was exceeded");
        }

        if (userBank2.getLimitOfFunding() >= amount) {
            double newBalance = toUser.getBalance() + amount;
            toUser.setBalance(newBalance);
        } else {
            System.out.println("Transfer limit was exceeded");
        }
    }

    @Override
    public void paySalary(User user) {
        double newBalance = user.getBalance() + user.getSalary();
        user.setBalance(newBalance);
    }
}
