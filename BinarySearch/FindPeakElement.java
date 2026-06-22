public class FindPeakElement {

    public static int findPeak(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        int peakIndex = findPeak(nums);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element: " + nums[peakIndex]);
    }
}
