import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Duplicate Characters:");

        boolean found = false;

        for (char ch : map.keySet()) {

            if (map.get(ch) > 1) {
                System.out.println(ch);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Duplicate Characters Found.");
        }

        sc.close();
    }
}
