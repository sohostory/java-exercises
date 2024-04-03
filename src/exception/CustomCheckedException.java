package exception;

public class CustomCheckedException {
    public static void validateAge(int age) throws InvlidAgeException {
        if (age < 0 || age > 120) {
            throw new InvlidAgeException("Invalid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(160);
        } catch (InvlidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
