public class User {
    private String firstName;
    private String lastName;
    private double balance;

    public User() {

    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, double balance) {
        this(firstName, lastName);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User(firstName=)";
    }
}
