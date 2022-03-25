package Lab3.phonebook;

import Lab2.library.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class PhoneBookMap implements PhoneBook{
    HashMap<String,Student> phoneBook ;

    public PhoneBookMap(){
        phoneBook=new LinkedHashMap<String,Student>();
    }

    @Override
    public Student searchByLastname(String lastname) {
        for(Student st:phoneBook.values()){
            if(st.getCognome().equals(lastname))
                return st;
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {

        if(phoneBook.containsKey(number)){
            for(Student st: phoneBook.values()){
                if(st.getNumber().equals(number))
                    return st;
            }
        }else
            return null;
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.put(student.getNumber(),student);
    }

    @Override
    public Student searchByName(String name) {

        for(Student st: phoneBook.values()){
            if(st.getNome().equals(name))
                return st;
        }

        return null;
    }

    @Override
    public void deleteByNumber(String number) {
        phoneBook.remove(number);
    }
}
