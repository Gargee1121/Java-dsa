import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() &&
                    temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                answer[i] = stack.peek() - i;
            } else {
                answer[i] = 0;
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = dailyTemperatures(temperatures);

        System.out.print("Output: ");

        for (int days : result) {
            System.out.print(days + " ");
        }
    }
}
