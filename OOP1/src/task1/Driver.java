package task1;

public class Driver {

    private final String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return " is driven by " + name;
    }
}