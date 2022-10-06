package task3;

import java.util.ArrayList;

public class Main {

    private static final ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer("John Doe", "johndoe"));
        customers.add(new Customer("Jane Doe", "janedoe"));
        customers.add(new Customer("John Smith", "johnsmith"));
        customers.add(new Customer("Jane Smith", "janesmith"));
        customers.add(new Customer("John Olsen", "johnolsen"));
        customers.add(new Customer("Jane Olsen", "janeolsen"));

        printCostumers();
    }

    public static void printCostumers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}