import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations {

    static void generatePermutations(
            int[] nums,
            boolean[] used,
            List<Integer> current,
            List<List<Integer>> result) {

        // Base Case
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            // Choose
            used[i] = true;
            current.add(nums[i]);

            // Explore
            generatePermutations(
                    nums,
                    used,
                    current,
                    result
            );

            // Backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = new ArrayList<>();

        generatePermutations(
                nums,
                new boolean[nums.length],
                new ArrayList<>(),
                result
        );

        System.out.println(result);
    }
}
