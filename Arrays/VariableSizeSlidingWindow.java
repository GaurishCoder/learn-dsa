public class VariableSizeSlidingWindow {
    public static int findLongestSubarrySum(int[] arr, int k) {
        int sum = 0;
        int left = 0;
        int maxLen = 0;

        // sum <= k

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    // sum >= k valid else sum<k

    public static int findShortestSubarrySum(int[] arr, int k) {
        int sum = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return minLen;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 4, 3 };

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("Shortest Subarry sum that is equal to k is " + findShortestSubarrySum(arr, 7));

    }
}
