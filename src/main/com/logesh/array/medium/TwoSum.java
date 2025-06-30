package src.main.com.logesh.array.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums={2,11,15,7};
        int target=9;
//        System.out.println(Arrays.toString(bruteForceTwoSum(nums,target)));
//        System.out.println(Arrays.toString(betterApproach(nums,target)));
        System.out.println(optimalApproachWithoutIndices(nums,target));
    }

    public static int[] bruteForceTwoSum(int[] nums, int target) {


        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] betterApproach(int[] nums ,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int dif=target-nums[i];
            if(map.containsKey(dif)){
                return new int[]{map.get(dif),i};
            }
            map.put(nums[i],i);
        }
      return null;
    }

    public static String optimalApproachWithoutIndices(int[] nums ,int target){
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int sum=0;
      while(left<right){
          sum=nums[left]+nums[right];
          if(target==sum){
              return "Present";
          }
          if(target>sum){
              left++;
          }
          if(target<sum){
              right--;
          }
      }
        return "Not Present";
    }
}
