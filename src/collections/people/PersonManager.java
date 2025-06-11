package collections.people;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonManager {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person p){
        people.add(p);
    }
    public void removePersonByEmail(String email){
       people.removeIf(person -> person.getEmail().equals(email));
    }
    public Person findPersonByName(String name){
        for (Person person : people) {
            if(person.getName() == name){
                return person;
            }
        }
        return null;
    }
    public void printAll(){
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
    public int countPeople(){
        return Person.getCount();
    }


}
