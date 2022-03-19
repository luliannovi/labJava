package Lab2.bankaccount;

public class BankAccountUnicredit extends AbstractBankAccount{
    double FeeDeposit=0.0;
    double FeeWithdraw=0.0;
    double AnnualInterest=0.0;

    public BankAccountUnicredit(String IBAN, double balance) {
        super(IBAN, balance);
    }

    @Override
    public String getIban() {
        return this.IBAN;
    }

    @Override
    public double withdraw(double tot) {
        this.balance -= tot*this.FeeWithdraw;
        return tot + tot*this.FeeWithdraw;
    }

    @Override
    public double transfer(BankAccount bankAccount, double tot) {
        bankAccount.deposit(tot);
        this.balance -= tot;
        return tot;
    }

    @Override
    public void deposit(double tot) {
        this.balance+=(tot-tot*this.FeeDeposit);
    }

    @Override
    public double addAnnualInterest() {
        this.balance+=this.balance*this.AnnualInterest;
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccountUnicredit{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                ", FeeDeposit=" + FeeDeposit +
                ", FeeWithdraw=" + FeeWithdraw +
                ", AnnualInterest=" + AnnualInterest +
                '}';
    }
}
