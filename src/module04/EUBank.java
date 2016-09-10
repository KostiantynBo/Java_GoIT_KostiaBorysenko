package module04;

public class EUBank extends Bank{
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
/* EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
limit of funding - 20000 if EUR and 10000 if USD
monthly rate - 0% with USD and 1% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
2% if EUR and up to 1000 and 4% if EUR and more than 1000*/

    @Override
    double getLimitOfWithdrawal() {
        double limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 2000;
        } else {
            limitOfWithdrawal = 2200;
        }
        return limitOfWithdrawal;
    }

    @Override
    double getLimitOfFunding() {
        double limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 20000;
        } else {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthRate;
        if (getCurrency() == Currency.USD) {
            monthRate = 1;
        } else {
            monthRate = 1 /100;
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
                commission = 2 / 100;
            } else {
                commission = 4 / 100;
            }
        }
        return commission;
    }
}
