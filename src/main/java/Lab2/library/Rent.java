package Lab2.library;

public class Rent {
    Student student;
    Item item;
    DateTime begin;
    DateTime end;

    public Rent(Student student, Item item, DateTime begin, DateTime end) {
        this.student = student;
        this.item = item;
        this.begin = begin;
        this.end = end;
    }

    public Rent() {

    }
}
