package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailFilterDemo {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("b@example.com");
        emails.add("a@example.com");
        emails.add("b@example.com");
        emails.add("a@example.com");
        emails.add("c@example.com");
        for (String email : emails) {
            System.out.println(email);
        }

        System.out.println();

        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(emails);

        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}
