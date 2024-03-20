package controlFlow.ex8avg;

public class Main {
    public static void main(String[] args) {
        int[] number = {91, 142, 123, 643, 73};
        int sum = 0;
        int odd = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[1] % 2 == 0) {
                odd++;
                sum += number[i];
            }
        }

        System.out.println("avg: " + (sum/odd));
        System.out.println(odd);
    }
}
