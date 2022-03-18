package Lab2.bankaccount;

public abstract class AbstractBankAccount implements BankAccount{
    String IBAN;
    double balance;

    public AbstractBankAccount(String IBAN, double balance) {
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getCountry(){
        StringBuilder sb = new StringBuilder();
        sb.append(IBAN.charAt(0));
        sb.append(IBAN.charAt(1));
        return sb.toString();
    }
}
