public class MoveZero {
    public static void moveZeroesToEnd(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 0, 3 };

        System.out.println("Original Array:");
        printArray(arr);

        moveZeroesToEnd(arr);

        System.out.println("\nAfter Operation:");
        printArray(arr);

    }
}
