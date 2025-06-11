package collections.people;

public class PeopleDemo {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        personManager.addPerson(new Person("Дмитрий", 22, "serge1@gmail.com"));
        personManager.addPerson(new Person("Олеся", 19, "serge2@gmail.com"));
        personManager.addPerson(new Person("Иван", 43, "serge3@gmail.com"));
        personManager.addPerson(new Person("Андрей", 15, "serge4@gmail.com"));
        personManager.addPerson(new Person("Алиса", 31, "serge5@gmail.com"));
        personManager.printAll();
        System.out.println();
        personManager.removePersonByEmail("serge1@gmail.com");
        personManager.printAll();
        System.out.println();
        System.out.println(personManager.findPersonByName("Олеся"));
        System.out.println(personManager.countPeople());
    }
}
