package module02;

public class Task022 {
    private static double sumCommission(double withdrawal, double commission) {

        return (withdrawal * commission) / 100;
    }

    private static void balancesSum(int balance, double withdrawal, double commission) {

        double percentage = sumCommission(withdrawal, commission);

        double transactionAmount = withdrawal + percentage;

        double balanceAfter;

        if (balance >= transactionAmount) {

            balanceAfter = balance - transactionAmount;
            System.out.println("OK " + percentage + " " + balanceAfter);
        } else {
            System.out.println("NO");

        }
    }

    public static void main(String[] args) {

        int balance = 1000; // попугаев на счету

        double withdrawal = 900; // попугаев нужно отдать

        double commission = 5;// процент за сделку

        balancesSum(balance, withdrawal, commission);


    }

}
