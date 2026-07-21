import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

    static String[] mapping = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };

    static void generateCombinations(
            int index,
            String digits,
            StringBuilder current,
            List<String> result) {

        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];

        for (char letter : letters.toCharArray()) {

            current.append(letter);

            generateCombinations(
                    index + 1,
                    digits,
                    current,
                    result
            );

            // Backtrack
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        generateCombinations(
                0,
                digits,
                new StringBuilder(),
                result
        );

        return result;
    }

    public static void main(String[] args) {

        String digits = "23";

        System.out.println(letterCombinations(digits));
    }
}
