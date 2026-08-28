package Strings.SlidingWindow;

import java.util.HashMap;

public class OneRepeatsCharacter {
    public static void findLongestRepeatingCharacterReplacement(String s, int k) {
        int left = 0, right = 0;
        int maxLen = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            char chRight = s.charAt(right);
            map.put(chRight, map.getOrDefault(chRight, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(chRight));
            while ((right - left + 1) - maxFreq > k) {
                char chLeft = s.charAt(left);
                map.put(chLeft, map.get(chLeft) - 1);
                if (map.get(chLeft) == 0) {
                    map.remove(chLeft);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        System.out.println("Longest Substring: " + maxLen);
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        findLongestRepeatingCharacterReplacement(s, k);
    }
}
