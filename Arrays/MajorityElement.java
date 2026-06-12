import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int candidate = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(count == 0) {
                candidate = arr[i];
            }

            if(arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;

        for(int num : arr) {
            if(num == candidate) {
                count++;
            }
        }

        if(count > n / 2) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }

        sc.close();
    }
}
