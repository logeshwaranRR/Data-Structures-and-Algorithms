package src.main.com.logesh.array.easy;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int continuous =0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1){
                continuous++;
                maxCount = Math.max(maxCount, continuous);
            }else if(nums[i] == 0){
                continuous = 0;
            }
        }
        return maxCount;
    }
}
