import java.util.*;

public class SlidingWindow {

    public static void maximumKConsecutiveSum(int[] arr, int k) {
        int oldSum = 0;
        for (int i = 0; i < k; i++) {
            oldSum += arr[i];
        }

        int left = 0, right = k, n = arr.length - 1;
        int maxSum = oldSum;
        while (right <= n) {
            oldSum = oldSum - arr[left] + arr[right];
            maxSum = Math.max(maxSum, oldSum);
            left++;
            right++;
        }
        System.out.println("Maximum K Sum:" + maxSum);
    }

    public static void maximumKConsecutiveAvg(int[] arr, int k) {
        int oldSum = 0;
        for (int i = 0; i < k; i++) {
            oldSum += arr[i];
        }

        float oldAvg = (float) oldSum / k;
        float maxAvg = oldAvg;

        int left = 0, right = k, n = arr.length - 1;
        while (right <= n) {
            oldSum = oldSum - arr[left] + arr[right];
            float newAvg = (float) oldSum / k;
            maxAvg = Math.max(maxAvg, newAvg);
            left++;
            right++;
        }
        System.out.println("Maximum K Avg:" + maxAvg);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countNegativeElemEachWindow(int[] arr, int k) {

        int count=0;
        for (int i = 0; i < k; i++) {
            if (arr[i]<0) {
                count++;
            }
        }

        int left = 0, right = k, n = arr.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        while (right <= n) {
            if (arr[left]<0) {
                count--;
            }
            if (arr[right]<0) {
                count++;
            }
            left++;
            right++;
            ans.add(count);
        }
        System.out.println("Count of Negative Element in Each Window:" + ans);
    }

    public static void main(String[] args) {
        int arr[] = { 2, -1, 3, -4, 5, -2, 6 };

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nRESULT:");
        countNegativeElemEachWindow(arr, 3);// [1, 2, 1, 2, 1]

    }
}
