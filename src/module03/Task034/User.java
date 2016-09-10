package module03.Task034;

public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary(){
        balance += salary;
    }

    double withdraw(int summ){
        double balanceAfter;
        if (summ < 1000) {

            balanceAfter = balance - summ*1.05;
            return balanceAfter;
        } else
            balanceAfter = balance - summ*1.1;
        return balanceAfter;
    }

    int companyNameLength (){

        return getCompanyName().length();
    }

    int monthIncreaser(int addMonth){
        return monthsOfEmployment += addMonth;
    }

    public static void main(String[] args) {

        User user = new User("Loni", 900, 1, "Gulver", 300, null);

        System.out.println(user.companyNameLength());

    }

}
