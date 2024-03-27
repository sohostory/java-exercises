package strings.ex2methods;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.length());
        System.out.println(str.toUpperCase() + " " + str.toLowerCase());
        System.out.println(str.substring(7, 12));
        System.out.println(str.replace("World", "Java"));
    }
}
