package module04;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    /* ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
     limit of funding - 5000 if EUR and 10000 if USD
     monthly rate - 1% with USD and 0% with EUR
     commision - 3% if USD and up to 1000, 5% if USD and more than 1000
     10% if EUR and up to 1000 and 11% if EUR and more than 1000 */
    @Override
    double getLimitOfWithdrawal() {
        double limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 100;
        } else {
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;
    }

    @Override
    double getLimitOfFunding() {
        double limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 5000;
        } else {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthRate;
        if (getCurrency() == Currency.USD) {
            monthRate = 1 / 100;
        } else {
            monthRate = 1;
        }
        return monthRate;
    }

    @Override
    double getCommission(int amount) {
        double commission;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) {
                commission = 3 / 100;
            } else {
                commission = 5 / 100;
            }
        } else {
            if (amount <= 1000) {
                commission = 10 / 100;
            } else {
                commission = 11 / 100;
            }
        }
        return commission;
    }
}
