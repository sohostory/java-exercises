package objects.ex2objects;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person();
        owner.name = "Ben";

        Car car = new Car();
        car.owner = owner;
        car.model = "Buick";

        System.out.println(car.model);
        System.out.println(car.owner);
    }
}

class Person {
    String name;
}

class Car {
    String model;
    Person owner;
}
