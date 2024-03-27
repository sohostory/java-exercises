package strings.ex5stringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hi");
        StringBuilder str2 = new StringBuilder("Hi");

        System.out.println(str1.toString().equals(str2));
        str1.append(str2);
        str1.reverse();
        System.out.println(str1);
        System.out.println(str2);
    }
}
