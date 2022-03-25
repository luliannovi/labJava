package Lab3.phonebook;

import Lab2.library.Student;

public interface PhoneBook {
    public Student searchByLastname(String lastname);
    public Student searchByNumber(String number);
    public void addPerson(Student student) ;
    public Student searchByName(String name);
    public void deleteByNumber(String number);
}
