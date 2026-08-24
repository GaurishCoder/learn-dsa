package Strings;

public class CountVowel {

    public static void countVowelsInString(String s){
        int count = 0;
        String vowel = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowel.indexOf(Character.toLowerCase(ch)) >= 0) {
                count++;
            }
        }
        System.out.println("Number of vowels occurs in string is:"+count);
    }

    public static void main(String[] args) {
        String s = "programming";
        countVowelsInString(s);
    }
}
