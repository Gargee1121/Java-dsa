import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static void findCombinations(
            int index,
            int[] candidates,
            int target,
            List<Integer> current,
            List<List<Integer>> result) {

        // Base Case
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // Include current element
        current.add(candidates[index]);

        findCombinations(
                index,
                candidates,
                target - candidates[index],
                current,
                result
        );

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        findCombinations(
                index + 1,
                candidates,
                target,
                current,
                result
        );
    }

    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        findCombinations(
                0,
                candidates,
                target,
                new ArrayList<>(),
                result
        );

        System.out.println(result);
    }
}
