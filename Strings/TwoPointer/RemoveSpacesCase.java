package Strings.TwoPointer;

/**
 * RemoveSpacesCase
 */
public class RemoveSpacesCase {
    public static void checkValidPalindromeAfterSpaceCasePunctuation(String s) {
        int left = 0, right = s.length() - 1;
        

       

        boolean ans = true;

        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);

            if (!Character.isLetter(charLeft)) {
                left++;
            }else if (!Character.isLetter(charRight)) {
                right--;
            }else{
                //swap
                left++;
                right--;
            }

            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            } else if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                ans = false;
                break;
            } else {
                left++;
                right--;
            }
        }
        if (ans) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Invalid Palindrome");
        }
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        checkValidPalindromeAfterSpaceCasePunctuation(s);
    }
}