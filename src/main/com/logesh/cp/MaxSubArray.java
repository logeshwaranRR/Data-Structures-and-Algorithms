package src.main.com.logesh.cp;

/*problem link
https://leetcode.com/problems/maximum-subarray/description/*/
public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums={5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int sum = 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
