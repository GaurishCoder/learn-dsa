public class KadaneAlgo {

    public static void findMaxSubarray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = currentSum;

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { -1, 3, -2, 5, -7, 4 };

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nMaximum Subarray Sum:");
        findMaxSubarray(arr);

    }
}
