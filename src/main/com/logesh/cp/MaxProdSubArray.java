package src.main.com.logesh.cp;

//Leetcode: 152. Maximum Product Subarray
public class MaxProdSubArray {
    public static void main(String[] args) {

        int[] nums = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println(maxProduct(nums));
    }

    public static double maxProduct(int[] nums){
        double prefix=1;
        double suffix=1;
        double maxProduct=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];
            maxProduct=Math.max(maxProduct,Math.max(prefix,suffix));

        }
        return maxProduct;
    }
}
