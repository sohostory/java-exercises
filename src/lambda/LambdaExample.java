package lambda;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator addition = (a, b) -> a + b;
        System.out.println(addition.operate(3, 5));

        NumericOperator findMax = (a, b) -> Math.max(a, b);
        System.out.println(findMax.operate(3,5));

        StringFormatter uppercase = str -> str.toUpperCase();
        System.out.println(uppercase.format("help"));

    }
}
