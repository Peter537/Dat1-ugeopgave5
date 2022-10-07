package task3;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final String username;
    private final int id;
    private static int IDCounter = 0;

    public Customer(String name, String username) {
        this.firstName = name.split(" ")[0];
        this.lastName = name.split(" ")[1];
        this.username = username;
        IDCounter++;
        this.id = IDCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';
    }
}