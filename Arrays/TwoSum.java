
public class TwoSum {

    

    public static void findTarget(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        boolean ans = false;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ans=true;
                System.out.println("[" + arr[left] + "," + arr[right] + "]");
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        if (!ans) {
            System.out.println("Target does not exists");
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
        findTarget(arr,target);

    }

}
