import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) {

        User[] users = {
          new User("user1", 34),
          new User("user2", 24),
          new User("user3", 44),
          new User("user4", 14),
        };

        System.out.println("Before Sort: "+Arrays.toString(users));
        Arrays.sort(users);
        System.out.println("After Sort: "+ Arrays.toString(users));
    }
}
