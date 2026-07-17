import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubsequences {

    static void generateSubsequences(
            int index,
            int[] arr,
            List<Integer> current,
            List<List<Integer>> result) {

        // Base Case
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(arr[index]);

        generateSubsequences(
                index + 1,
                arr,
                current,
                result
        );

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        generateSubsequences(
                index + 1,
                arr,
                current,
                result
        );
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        List<List<Integer>> result = new ArrayList<>();

        generateSubsequences(
                0,
                arr,
                new ArrayList<>(),
                result
        );

        System.out.println(result);
    }
}
