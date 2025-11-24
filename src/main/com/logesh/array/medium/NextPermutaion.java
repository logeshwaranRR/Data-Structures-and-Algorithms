package src.main.com.logesh.array.medium;

import java.util.Arrays;



public class NextPermutaion {
    public static void main(String[] args) {
        int[] nums ={1,3,2};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
       int n = nums.length;
       int index= -1;
       for(int i=n-2;i>=0;i--){
           if(nums[i]<nums[i+1]){
               index=i;
               break;
           }
       }
       if(index==-1){
           rev(nums,0,nums.length-1);
           return;
       }
       for(int i= nums.length-1;index<i ;i--){
           if(nums[index]<nums[i]){
               int temp=nums[index];
               nums[index]=nums[i];
               nums[i]=temp;
               break;
           }

       }
       rev(nums,index+1, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }
    static void rev(int nums[],int start,int end){

        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
