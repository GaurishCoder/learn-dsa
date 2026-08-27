package Strings.SlidingWindow;

import java.util.*;

public class KDistinctCharacters {
    public static void findLongestSubstringKDistinctChar(String s, int k) {
        int left = 0, right = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.size() > k) {
                char ch = s.charAt(left);
                int value = map.get(ch);
                map.put(ch, value - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        System.out.println("Longest Substring with K Distinct Character:" + maxLen);
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        findLongestSubstringKDistinctChar(s, k);
    }
}
