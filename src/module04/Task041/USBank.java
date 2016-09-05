package module04.Task041;

public class USBank extends Bank{

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}
