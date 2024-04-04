package functional;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Kevin", "Bob");
        names.stream().forEach(System.out::println);
    }
}
