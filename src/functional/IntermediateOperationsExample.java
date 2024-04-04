package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("watermelon", "apples", "pineapple", "pear");
        List<String> filteredUpper = words.stream()
                .filter(n -> n.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredUpper);
        }
    }

