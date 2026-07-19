import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubsets {

    static void generateSubsets(
            int index,
            int[] nums,
            List<Integer> current,
            List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(nums[index]);

        generateSubsets(
                index + 1,
                nums,
                current,
                result
        );

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        generateSubsets(
                index + 1,
                nums,
                current,
                result
        );
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = new ArrayList<>();

        generateSubsets(
                0,
                nums,
                new ArrayList<>(),
                result
        );

        System.out.println(result);
    }
}
