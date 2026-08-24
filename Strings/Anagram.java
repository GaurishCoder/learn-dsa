package Strings;

import java.util.HashMap;

public class Anagram {

    public static void isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Strings are not anagram");
        }

        HashMap<Character,Integer> map = new HashMap<>(26); // 26
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        isAnagram(s1, s2);
    }
}
