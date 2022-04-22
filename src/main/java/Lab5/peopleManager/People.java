package Lab5.peopleManager;

public class People {
    public String name;
    public String cognome;
    public int età;
    public String codiceFiscale;

    public People(String name, String cognome, int età, String codiceFiscale) {
        this.name = name;
        this.cognome = cognome;
        this.età = età;
        this.codiceFiscale = codiceFiscale;
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

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public String toCSV(){
        return this.name+";"+this.cognome+";"+this.età+";"+this.codiceFiscale;
    }
}
