import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MixedQuestion {
    public static void maxSumSubarray(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;
        int left = 0, right = k;

        while (right < arr.length) {
            sum = sum - arr[left] + arr[right];
            max = Math.max(max, sum);
            left++;
            right++;
        }
        System.out.println("Maximum subarray sum:" + max);
    }

    public static void findPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int need = target - current;

            if (map.containsKey(need)) {

                ArrayList<Integer> elem = new ArrayList<>();
                elem.add(need);
                elem.add(current);

                if (!pairs.contains(elem)) {
                    pairs.add(elem);
                }
            }

            map.put(current, i);
        }

        System.out.println(pairs);
    }

    public static int[] calculatePrefixSum(int[] arr) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        return prefix;
    }


     public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int current : set) {

            // Start of a sequence
            if (!set.contains(current - 1)) {

                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static int countSubarrays(int[] arr, int target) {

        int currentPrefix[] = calculatePrefixSum(arr);

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        map.put(0, 1);

        for (int i = 0; i < currentPrefix.length; i++) {

            int need = currentPrefix[i] - target;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(
                    currentPrefix[i],
                    map.getOrDefault(currentPrefix[i], 0) + 1
                );
        }

        return count;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Original Array:");
        printArray(arr);

        maxSumSubarray(arr, 3);

    }
}
