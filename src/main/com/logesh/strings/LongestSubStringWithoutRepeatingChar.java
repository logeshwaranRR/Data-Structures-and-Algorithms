package src.main.com.logesh.strings;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String wrd = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(wrd));

    }

    public static int lengthOfLongestSubstring(String s) {
        int right =0;
        int left = 0;
        int length = s.length();
        int maxLength = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        while(right<length){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right))+1);
            }

                map.put(s.charAt(right),right);
                maxLength = Math.max(maxLength, right-left+1);

            right++;
        }
        return maxLength;
    }
}
