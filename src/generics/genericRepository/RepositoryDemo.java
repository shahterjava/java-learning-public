package generics.genericRepository;

public class RepositoryDemo {
    public static void main(String[] args) {
        GenericRepository<User> users = new GenericRepository<>();
        users.add(new User(1, "Dmitriy"));
        users.add(new User(2, "Alexei"));
        users.add(new User(3, "Sergey"));
        System.out.println(users.findById(1));
        System.out.println(users.findById(2));
        System.out.println(users.findById(3));
        System.out.println();
        users.removeById(2);
        System.out.println(users.getAll());

    }
}
