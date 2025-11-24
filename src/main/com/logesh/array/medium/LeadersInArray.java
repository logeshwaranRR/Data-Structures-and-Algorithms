package src.main.com.logesh.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums={-3, 4, 5, 1, -4, -5};
        System.out.println(leaders(nums));
    }
    public static List<Integer> leaders(int[] nums) {

        List<Integer> leaders= new ArrayList<>();

        int max =nums[nums.length-1];
        leaders.add(max);
        for(int i= nums.length-2;i>=0;i--){
            if(nums[i]>max){
                leaders.add(nums[i]);
                max=nums[i];
            }
        }
        return leaders.reversed();

    }

}
