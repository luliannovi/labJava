package Lab2.phonebook;

import Lab2.library.Student;

public interface PhoneBook {
    void addPerson(Student student);
    void deleteByNumber(String number);
    Student searchByLastname(String cognome);
    Student searchByName(String name);
    Student searchByNumber(String number);

}
