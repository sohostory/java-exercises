package controlFlow.ex1ifelse;

public class Main {
    public static void main(String[] args) {
        int age = 15;

        if (age < 5) {
            System.out.println("Free");
        } else if (age < 12) {
            System.out.println("$5");
        } else if (age < 18) {
            System.out.println("$10");
        } else {
            System.out.println("$15");
        }
    }
}
