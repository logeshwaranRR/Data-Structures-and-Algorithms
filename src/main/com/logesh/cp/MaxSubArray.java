package src.main.com.logesh.cp;

/*problem link
https://leetcode.com/problems/maximum-subarray/description/*/
public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArrayOptimal(nums));
        System.out.println(maxSubArrayBrute(nums));
        System.out.println(maxSubArrayBetter(nums));
    }

    private static int maxSubArrayOptimal(int[] nums) {
        int sum = 0;
        int max=Integer.MIN_VALUE;
        int maxStart=0;
        int maxEnd=0;
        for(int i=0;i<nums.length;i++){

            if(sum==0) {
            maxStart = i;
            }

            sum = sum + nums[i];
            if(sum>max){
                max=sum;
                maxEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.printf("start index : %d && end index : %d \n",maxStart,maxEnd);
        return max;
    }

    private static int maxSubArrayBrute(int[] nums){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j< nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                    maxSum=Math.max(maxSum,sum);
                }

            }
        }
        return maxSum;
    }
    private static int maxSubArrayBetter(int[] nums){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j< nums.length;j++){
                sum+=nums[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
