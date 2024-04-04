package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> newList = Arrays.asList("hello", "you");
        List<String> uppercaseList = newList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercaseList);
    }
}
