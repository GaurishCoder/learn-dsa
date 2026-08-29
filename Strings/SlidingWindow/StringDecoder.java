package Strings.SlidingWindow;

import java.util.*;

public class StringDecoder {
    public static void decodeCharacter(String s) {
        char[] hash = new char[26];
        for (char i = 'A'; i <= 'Z'; i++) {
            int idx = i - 65;   
            hash[idx] = i; 
        }
        int left=0,right=0,count=0;
        String ans=" ";
        while (right<s.length()) {
            if (s.charAt(right)==s.charAt(left)) {
                count++;
            }else{
                ans+=hash[count-1];
                left=right+1;
                count=0;
            }
            right++;
        }
        System.out.println("Decode String is:"+ans);
    }
    public static void main(String[] args) {
        String s = "111011011110";
        decodeCharacter(s);
    }
}
