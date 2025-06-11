package oop.person;

import java.util.HashSet;
import java.util.Set;

public class PersonDemo {

    public static void main(String[] args) {
        Person dmitriy = new Person("Дмитрий", 22, "sergee@gmail.com");
        Person dmitriy2 = new Person("Дмитрий", 22, "sergee@gmail.com");
        Person sergey = new Person("Сергей", 22, "sergee@gmail.com");
        Set<Person> set = new HashSet<>();
        set.add(dmitriy);
        set.add(dmitriy2);
        set.add(sergey);
        for (Person person : set) {
            System.out.println(person.toString());
        }
        System.out.println(dmitriy.equals(dmitriy2));
    }
}
