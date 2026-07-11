import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeIntegerInEveryWindow {

    public static void firstNegative(int[] arr, int k) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                queue.offer(i);
            }

            while (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.poll();
            }

            if (i >= k - 1) {

                if (queue.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arr[queue.peek()] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        firstNegative(arr, k);
    }
}
