package exception;

public class InvlidAgeException extends Exception {
    InvlidAgeException(String message) {
        super(message);
    }
    InvlidAgeException(Exception e) {
        super(e);
    }
    InvlidAgeException() {
        super();
    }
}
