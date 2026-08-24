package Strings;

import java.util.HashMap;

public class FrequencyCharacter {

    public static void countEachCharacterFrequency(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
    }


    public static void main(String[] args) {
        String s = "programming";
        countEachCharacterFrequency(s);
    }
}
