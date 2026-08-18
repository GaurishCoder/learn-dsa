public class SecondLargest {
    public static void findSecondLargestElem(int[] arr) {
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && max != arr[i]) {
                smax = arr[i];
            }
        }
        System.out.print(smax);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 2, 50, 3 };

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nSecond largest element in array:");
        findSecondLargestElem(arr);

    }
}
