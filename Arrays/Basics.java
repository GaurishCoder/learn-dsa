public class Basics {

    public static void findMinMax(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum Element:" + min);
        System.out.println("Maximum Element:" + max);
    }

    public static void frequencyOfEachElement(int[] arr) {
        System.out.println("Element:Count");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int visited = -1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != visited && arr[i] == arr[j]) {
                    count++;
                    arr[j] = visited;
                }
            }
            if (arr[i] != -1) {
                System.out.println(arr[i] + " : " + count);
            }
        }
    }

    public static void traversalArray(int[] arr) {
        // traversal to array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 10, 2, 2, 1 };

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nFrequency of each element in array:");
        frequencyOfEachElement(arr);

    }
}
