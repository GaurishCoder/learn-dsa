public class Palindrome {
    public static void isPalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;
        boolean ans = true;
        while (left < right) {
            if (arr[left] != arr[right]) {
                ans = false;
                break;
            }
            left++;
            right--;

        }
        if (ans) {
            System.out.println("Palindrome Exists");
        } else {
            System.out.println("Palindrome Not Exists");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 8, 9, 14 };
        int target = 10;

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nTwo Sum equals to target:");
        isPalindrome(arr);

    }
}
