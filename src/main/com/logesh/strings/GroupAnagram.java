package src.main.com.logesh.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String[]  strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> grp = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String st =new String(c);
            grp.putIfAbsent(st, new ArrayList<>());
            grp.get(st).add(s);
        }

        return new ArrayList<>(grp.values());
    }
}
