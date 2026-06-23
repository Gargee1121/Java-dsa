public class SquareRootUsingBinarySearch {

    public static int sqrt(int n) {

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == n)
                return mid;

            if (square < n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 28;

        System.out.println("Square Root: " + sqrt(n));
    }
}
