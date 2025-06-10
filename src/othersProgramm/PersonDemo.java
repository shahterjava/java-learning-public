package othersProgramm;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Дмитрий", 23);
        person.sayHello();
        person.setName("Алексей");
        person.sayHello();
    }
}
