package GestioneUtenti;

import java.util.Date;

public class User {
        public String name;
        public String cognome;
        public String phoneNumber;
        public String fiscalCode;
        public Date nascita;

    public User(String name, String cognome, String phoneNumber, String fiscalCode, Date nascita) {
        this.name = name;
        this.cognome = cognome;
        this.phoneNumber = phoneNumber;
        this.fiscalCode = fiscalCode;
        this.nascita = nascita;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public Date getNascita() {
        return nascita;
    }

    public void setNascita(Date nascita) {
        this.nascita = nascita;
    }


}
