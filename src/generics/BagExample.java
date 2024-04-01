package generics;

public class BagExample {
    public static void main(String[] args) {
        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("watermelon");
        stringBag.addItem(("grapes"));
        stringBag.addItem("crackers");

        Bag<Integer> integerBag = new Bag<>();
        integerBag.addItem(1);
        integerBag.addItem(2);
        integerBag.addItem(3);
    }
}
