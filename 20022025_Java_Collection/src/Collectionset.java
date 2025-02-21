import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collectionset {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Muhammat");
        names.add("Ronaldo");
        names.add("Messi");

        for (var name : names) {
            System.out.println(name);
        }

        Set<User> users = Set.of(
                new User("user1", 10),
                new User("user2", 20),
                new User("user3", 30)
        );

        for (var user : users) {
            System.out.println(user);
        }
    }
}
