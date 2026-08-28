package Strings.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumSubstringCharacter {
    public static void findMinimumSubstringContainsAllTChar(String s, String t) {

        int left = 0;
        int right = 0;

        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        HashMap<Character, Integer> mapOfT = new HashMap<>();

        // Frequency of characters required from t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            mapOfT.put(ch, mapOfT.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> mapOfS = new HashMap<>();

        // Number of characters whose required frequency is satisfied
        int formed = 0;

        while (right < s.length()) {

            // Expand window
            char chRight = s.charAt(right);

            mapOfS.put(
                    chRight,
                    mapOfS.getOrDefault(chRight, 0) + 1);

            // Character is required and its required frequency is now satisfied
            if (mapOfT.containsKey(chRight)
                    && mapOfS.get(chRight).equals(mapOfT.get(chRight))) {

                formed++;
            }

            // Window is valid → try shrinking
            while (formed == mapOfT.size()) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                // Remove left character
                char chLeft = s.charAt(left);

                mapOfS.put(
                        chLeft,
                        mapOfS.get(chLeft) - 1);

                // Window is no longer satisfying this character
                if (mapOfT.containsKey(chLeft)
                        && mapOfS.get(chLeft) < mapOfT.get(chLeft)) {

                    formed--;
                }

                left++;
            }

            right++;
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("");
        } else {
            System.out.println(s.substring(minStart, minStart + minLen));
        }
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        findMinimumSubstringContainsAllTChar(s, t);
    }
}
