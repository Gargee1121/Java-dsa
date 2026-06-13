import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        // Reversing the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Displaying the result
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
