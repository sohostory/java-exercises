package controlFlow.ex7highlow;

public class Main {
    public static void main(String[] args) {
        int[] grades = { 45, 69, 91, 100};

        int high = grades[0];
        int low = grades[0];

        for (int grade:grades) {
            if (grade > high) {
                high = grade;
            } else if (grade < low) {
                low = grade;
            }
        }
        System.out.println(high);
        System.out.println(low);
    }
}
