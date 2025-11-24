package src.main.com.logesh.array.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
     int[] nums={1,0,1,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {

        Set<Integer> numsSet = new HashSet<>();
        int longest=1;
        for(int i:nums){
            numsSet.add(i);
        }
        int index=0;
        for(int i : numsSet){
            if(!numsSet.contains(i-1)){
                int cnt=1;
                int current=i;
                while(numsSet.contains(current+1)){
                    cnt++;
                    current++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;

    }
}
