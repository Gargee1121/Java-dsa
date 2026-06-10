import java.util.Scanner;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter first sorted array:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter second sorted array:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0;

        System.out.print("Union: ");

        while(i < n1 && j < n2) {
            if(arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else if(arr1[i] > arr2[j]) {
                System.out.print(arr2[j++] + " ");
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        while(i < n1) {
            System.out.print(arr1[i++] + " ");
        }

        while(j < n2) {
            System.out.print(arr2[j++] + " ");
        }

        sc.close();
    }
}
