import java.util.Stack;

public class NextGreaterElement {

    public static void nextGreaterElement(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        System.out.print("Next Greater Elements: ");

        for (int x : result)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        nextGreaterElement(arr);
    }
}
