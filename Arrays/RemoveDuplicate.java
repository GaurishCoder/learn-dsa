public class RemoveDuplicate {
    public static void removeDuplicateInPlace(int[] arr) {
        int i = 0, j = 1;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
            j++;
        }

        System.out.println("Unique Element:");
        for (int j2 = 0; j2 <= i; j2++) {
            System.out.print(arr[j2] + " ");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println("Original Array:");
        printArray(arr);
        removeDuplicateInPlace(arr);
    }
}
