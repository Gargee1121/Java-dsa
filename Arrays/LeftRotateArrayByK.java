import java.util.Scanner;

public class LeftRotateArrayByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n - k; i++) {
            temp[i] = arr[i + k];
        }

        for (int i = 0; i < k; i++) {
            temp[n - k + i] = arr[i];
        }

        System.out.println("Array after left rotation:");

        for (int num : temp) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
