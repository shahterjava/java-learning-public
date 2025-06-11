package collections.streamTasks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Dmitriy", 22, "sergee1@gmail.com", true, "admin"),
                new User("Alice", 24, "sergee2@gmail.com", false, "user"),
                new User("Daniil", 28, "sergee3@gmail.com", true, "user"),
                new User("Mariya", 18, "sergee4gmail.com", true, "moderator"),
                new User("Maks", 31, "sergee5@gmail.com", false, "moderator"),
                new User("Alexei", 23, "sergee6@gmail.com", true, "admin")
        );
        System.out.println(getVerifiedEmails(users));
        System.out.println();
        System.out.println(getAdultUsers(users));
        System.out.println();
        System.out.println(groupByRole(users));
        System.out.println();
        System.out.println(findFirstUnverified(users));
        System.out.println();
        System.out.println(hasModerator(users));
        System.out.println();
        System.out.println(getSortedNames(users));
    }
    public static List<String> getVerifiedEmails(List<User> users){
       return users.stream().filter(User::isVerified)
                .map(User::getEmail)
                .collect(Collectors.toList());
    }
    public static List<User> getAdultUsers(List<User> users){
        return users.stream()
                .filter(user -> user.getAge() > 21)
                .collect(Collectors.toList());
    }

    public static Map<String,List<User>> groupByRole(List<User> users){
        return users.stream()
                .collect(Collectors.groupingBy(User::getRole));
    }

    public static Optional<User> findFirstUnverified(List<User> users){
        return users.stream().filter(u -> !u.isVerified())
                .findFirst();
    }
    public static boolean hasModerator(List<User> users){
        return users.stream()
                .anyMatch(user -> user.getRole().equalsIgnoreCase("moderator"));
    }

    public static List<String> getSortedNames(List<User> users){
        return users.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

}
