package exception;

public class ThrowingExceptions {
    public static void validateNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
    }
}
