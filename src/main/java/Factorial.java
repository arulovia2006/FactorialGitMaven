public class Factorial {

    public static long fact(int n) {
        if (n < 0)
            throw new IllegalArgumentException(
                "Number cannot be negative");

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
