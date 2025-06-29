package src.main.com.logesh.strings;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "a";
        String t = "b";
        System.out.println(minWindow(s, t));

    }

    public static String minWindow(String s, String t) {
        int right = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int required = mp.size();
        int matchCount = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        if (s.length() < t.length()) {
            return "";
        }
        while (right < s.length()) {
            char c= s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if(mp.containsKey(c) && window.get(c).intValue() == mp.get(c).intValue()){
                matchCount++;
            }
            while(matchCount==required){
                if(right-left+1<minLen){
                    start=left;
                    minLen=right-left+1;
                }
                char l = s.charAt(left);
                window.put(l,window.getOrDefault(l,0)-1);
                if(mp.containsKey(l) && window.get(l).intValue()<mp.get(l).intValue()){
                    matchCount--;
                }
                left++;

            }
            right++;

        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}
