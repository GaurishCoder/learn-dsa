public class PrefixSum {

    public static int[] calculatePrefixSum(int[] arr) {
        int prefix[] = new int[arr.length];
        int k = 1;
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[k] = arr[i] + prefix[i - 1];
            k++;
        }
        return prefix;
    }

    public static void executeQueries(int[] arr) {
        int queries[][] = {
                { 0, 2 },
                { 1, 4 },
                { 2, 5 }
        };

        int prefix[] = calculatePrefixSum(arr);
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int left = queries[i][0];
            int right = queries[i][1];
            if (left == 0) {
                sum = prefix[right];
            } else {
                sum = prefix[right] - prefix[left - 1];
            }
            System.out.println("Sum of range between index " + left + " to " + right + " is : " + sum);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, -2, 5, 1, -4, 6 };

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("Sum of Queries:");
        executeQueries(arr);

    }
}
