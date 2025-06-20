package collections.people;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String email;
    private static int count;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0) {
            this.age = age;
        } else{
            System.out.println("Возраст должен быть не меньше нуля!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        collections.people.Person person = (collections.people.Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    public static int getCount() {
        return count;
    }
}

