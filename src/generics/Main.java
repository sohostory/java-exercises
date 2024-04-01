package generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(56);

        Box<String> stringBox = new Box<> ();
        stringBox.setContent("Hello");
    }
}
