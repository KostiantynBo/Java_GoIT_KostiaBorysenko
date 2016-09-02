package module02;

public class Task023 {

    private static int[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private static double commission = 5;

    private static double sumCommission(double withdrawal) {
        return (withdrawal * commission) / 100;
    }

    private static void balancesSum(double withdrawal, String ownerName) {

        //int p;

        double percentage = sumCommission(withdrawal);
        double transactionAmount = withdrawal + percentage;
        double balanceAfter;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                //p = i;
                if (balances[i] >= transactionAmount) {
                    balanceAfter = balances[i] - transactionAmount;
                    System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
                } else {
                    System.out.println(ownerName + " NO");

                }

            }
        }
    }


    public static void main(String[] args) {

        String ownerName = "Jane";
        double withdrawal = 1000;
        balancesSum(withdrawal, ownerName);
    }

}
