package objects.ex5objectMethod;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person();
        owner.name = "Jonny";
        owner.age = 19;
        System.out.println(owner.name);
        System.out.println(owner.age);
        modifyPerson(owner);
        System.out.println(owner.name);
        System.out.println(owner.age);
    }

    public static void modifyPerson(Person p) {
        p.name = "Bob";
        p.age = 50;
    }

}

class Person {
    String name;
    int age;


}