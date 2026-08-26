package Strings;

public class ReverseString {

    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String result = new String(arr);
        return result;
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println("Original String:" + s);
        System.out.println("Reverse String:" + reverseString(s));

    }
}
