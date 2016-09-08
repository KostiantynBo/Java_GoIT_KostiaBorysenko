package module04;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    /* USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
     limit of funding - 10000 if EUR and no limit if USD
     monthly rate - 1% with USD and 2% with EUR
     commision - 5% if USD and up to 1000, 7% if USD and more than 1000
             6% if EUR and up to 1000 and 8% if EUR and more than 1000 */
    @Override
    double getLimitOfWithdrawal() {
        double limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 1000;
        } else {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override
    double getLimitOfFunding() {
        double limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 10000;
        } else {
            limitOfFunding = Double.MAX_VALUE;
        }
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthRate;
        if (getCurrency() == Currency.USD) {
            monthRate = 1 / 100;
        } else {
            monthRate = 2 / 100;
        }
        return monthRate;
    }

    @Override
    double getCommission(int amount) {
        double commission;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) {
                commission = 5 / 100;
            } else {
                commission = 7 / 100;
            }
        } else {
            if (amount <= 1000) {
                commission = 6 / 100;
            } else {
                commission = 8 / 100;
            }
        }
        return commission;
    }

}
