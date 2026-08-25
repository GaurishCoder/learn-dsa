package Strings;

public class RepeatOnces {

    public static void findFirstCharacterOccursOnes(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            int value = freq[idx];
            if (value == 1) {
                System.out.println("First Character that repeats onces is:" + s.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        String s = "leetcode";

        findFirstCharacterOccursOnes(s);
    }
}
