package Lab2.bankaccount;

public interface BankAccount {
    String getIban();
    double withdraw(double tot);
    double transfer(BankAccount bankAccount, double tot);
    void deposit(double tot);
    double addAnnualInterest();
    String getCountry();
}
