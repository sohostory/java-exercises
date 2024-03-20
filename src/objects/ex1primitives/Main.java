package objects.ex1primitives;

import objects.ex1primitives.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Henry";
        person.age = 18;

        System.out.println(person.name);
        System.out.println(person.age);
    }
}
