package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumValueExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 4, 6, 8, 10);
        Optional<Integer> maxNum = number.stream().max(Integer::compare);
        maxNum.ifPresent(value -> System.out.println(value));
    }
}
