package Lab2.bankaccount;

public class BankAccountIntesa extends AbstractBankAccount{
    double FeeDeposit=0.0;
    double FeeWithDraw=0.0;
    double AnnualInterest=0.0;

    public BankAccountIntesa(String IBAN, double balance) {
        super(IBAN, balance);
    }

    public double getFeeDeposit() {
        return FeeDeposit;
    }

    public void setFeeDeposit(double feeDeposit) {
        FeeDeposit = feeDeposit;
    }

    public double getFeeWithDraw() {
        return FeeWithDraw;
    }

    public void setFeeWithDraw(double feeWithDraw) {
        FeeWithDraw = feeWithDraw;
    }

    public double getAnnualInterest() {
        return AnnualInterest;
    }

    public void setAnnualInterest(double annualInterest) {
        AnnualInterest = annualInterest;
    }

    @Override
    public String getIban() {
        return this.IBAN;
    }

    @Override
    public double withdraw(double tot) {
        double amount = tot - tot*this.getFeeWithDraw();
        this.balance-=amount;
        return amount;
    }

    @Override
    public double transfer(BankAccount bankAccount, double tot) {
        bankAccount.deposit(tot);
        this.balance-=tot;
        return tot;
    }

    @Override
    public void deposit(double tot) {
        double amount = tot - tot*this.getFeeDeposit();
        this.balance+=amount;
    }

    @Override
    public double addAnnualInterest() {
        this.balance += this.balance*this.AnnualInterest;
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccountIntesa{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                ", FeeDeposit=" + FeeDeposit +
                ", FeeWithDraw=" + FeeWithDraw +
                ", AnnualInterest=" + AnnualInterest +
                '}';
    }
}
