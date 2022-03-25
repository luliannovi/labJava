package Lab3.phonebook;

import Lab2.library.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> phoneBook;
    public PhoneBookList(){
        phoneBook = new ArrayList<>();
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student st : phoneBook){
            if(st.getCognome().equals(lastname))
                return st;
    }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        for (Student st : phoneBook){
            if(st.getNumber().equals(number))
                return st;
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.add(student);
    }

    @Override
    public Student searchByName(String name) {
        for (Student st : phoneBook){
            if(st.getNome().equals(name))
                return st;
        }
        return null;
    }

    @Override
    public void deleteByNumber(String number) {
        for(Iterator<Student> st =this.phoneBook.iterator();st.hasNext();){
            Student i=st.next();
            if(i.getNumber().equals(number))
                st.remove();
        }
    }
}
