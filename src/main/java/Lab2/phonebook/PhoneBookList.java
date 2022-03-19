package Lab2.phonebook;

import Lab2.library.Student;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> pb;

    public PhoneBookList() {
        pb=new ArrayList<Student>();
    }

    @Override
    public void addPerson(Student student) {
        pb.add(student);

    }

    @Override
    public void deleteByNumber(String number) {
        for(Student s : pb){
            if(s.getNumber().equals(number))
                this.pb.remove(s);
        }
    }

    @Override
    public Student searchByLastname(String cognome) {
        for(Student s:pb){
            if(s.getCognome().equals(cognome))
                return s;
        }
        return null;
    }

    @Override
    public Student searchByName(String name) {
        for(Student s:pb){
            if(s.getNome().equals(name))
                return s;
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        for(Student s:pb){
            if(s.getNumber().equals(number))
                return s;
        }
        return null;
    }
}
