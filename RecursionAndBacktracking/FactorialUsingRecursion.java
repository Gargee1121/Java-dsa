public class FactorialUsingRecursion {

    static long factorial(int n) {

        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive Case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Factorial of " + n + ": "
                + factorial(n));
    }
}
