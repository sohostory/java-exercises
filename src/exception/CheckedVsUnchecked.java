package exception;

public class CheckedVsUnchecked {
    public static void validateString(String str) throws EmptyStringException {
            if (str.isEmpty()) {
                throw new EmptyStringException("The provided string is empty");
            }
        }
}
