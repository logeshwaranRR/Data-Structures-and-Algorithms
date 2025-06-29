package src.main.com.logesh.strings;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="tagarma";
        System.out.println(isAnagram(s,t));
        char[] ch =s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch,ch2));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(mp.containsKey(ch) && mp.get(ch)>0){
                mp.put(ch,mp.get(ch)-1);
            }
            else{
                return false;
            }
        }
        return true;

    }
}
