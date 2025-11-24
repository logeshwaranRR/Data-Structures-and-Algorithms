package src.main.com.logesh.array.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2,1,1,1};
        System.out.println(majorityElement2(nums));
    }

    private static int majorityElement2(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
                int val=map.getOrDefault(num,0);
                map.put(num,val+1);

        }
        for(Map.Entry<Integer,Integer> set:map.entrySet()){
            if(set.getValue()>nums.length/2){
                return set.getKey();
            }

        }
        return -1;
    }

    private static int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int num:nums){
            if(count==0){
                count++;
                element=num;
            }else if(num==element){
                count++;
            }else{
                count--;
            }

        }
        return element;
    }
}
