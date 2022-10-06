package task1;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Peter", 19);
        Car car = new Car("BMW", "X5", 2015, "SUV");
        car.setDriver(driver);
        System.out.println(car + "" + car.getDriver());

        Car car2 = new Car("Tesla", "Model S", 2018, "Sedan");
        car2.setDriver(driver);
        System.out.println(car2 + "" + car2.getDriver());
    }
}