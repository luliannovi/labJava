package Lab2.library;

public class Student {
    String nome;
    String cognome;
    String number;
    public Student(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Student(String nome, String cognome, String number) {
        this.nome = nome;
        this.cognome = cognome;
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
