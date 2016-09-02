package module02;

public class Task024 {
    private static int[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    private static void balancesSum(double fund, String ownerName) {

        double balanceAfter;

        for (int i = 0; i < ownerNames.length; i++) {

            if (ownerName.equals(ownerNames[i])) {
                balanceAfter = balances[i] + fund;
                System.out.println(ownerName + " " + balanceAfter);

            }
        }
    }

    public static void main(String[] args) {

        String ownerName = "Jane";
        double fund = 1000;
        balancesSum(fund, ownerName);
    }
}
