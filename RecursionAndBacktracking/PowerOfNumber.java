public class PowerOfNumber {

    static long power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        long half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 10;

        System.out.println(power(x, n));
    }
}
