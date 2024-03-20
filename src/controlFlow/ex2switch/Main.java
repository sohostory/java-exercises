package controlFlow.ex2switch;

public class Main {
    public static void main(String[] args) {
        char grade = 'B';
        String comment;

        switch (grade) {
            case 'A':
                comment = "Good work!";
                break;
            case 'B':
                comment = "Nice work!";
                break;
            case 'C':
                comment = "Ehhh";
                break;
            case 'D':
                comment = "next time...";
                break;
            case 'F':
                comment = "hmmm...";
                break;
            default:
                comment = "invalid grade.";
        }

        System.out.println(comment);
    }
}
