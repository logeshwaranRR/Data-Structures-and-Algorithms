package src.main.com.logesh.array.medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
     int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(nums));
    }

    private static int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int num:nums){
            sum+=num;
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }


        }
        return max;
    }

    private static int maxSubArray2(int[] nums) {
        int sum=0;
        int start=0;
        int end=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
            if(max<sum){
                max=sum;
                end=i;

            }
            if(sum<0){
                sum=0;
                start=i+1;
            }


        }
        for(int i=start;i<=end;i++) {
            System.out.print(nums[i]+ " ");
        }
        return max;
    }
}
