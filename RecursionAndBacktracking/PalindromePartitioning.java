import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    static List<List<String>> result = new ArrayList<>();

    static void partition(String s, int index, List<String> current) {

        if (index == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (isPalindrome(s, index, i)) {

                current.add(s.substring(index, i + 1));

                partition(s, i + 1, current);

                current.remove(current.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        partition("aab", 0, new ArrayList<>());

        System.out.println(result);
    }
}
