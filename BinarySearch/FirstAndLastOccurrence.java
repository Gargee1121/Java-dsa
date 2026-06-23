public class FirstAndLastOccurrence {

    static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 8};
        int target = 4;

        System.out.println("First Index: " + firstOccurrence(arr, target));
        System.out.println("Last Index: " + lastOccurrence(arr, target));
    }
}
