package src.main.com.logesh.array.medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int nums[]={2,0,1};
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            if(nums[i]==1){
                count1++;
            }
            if(nums[i]==2){
                count2++;
            }

        }
        int index=0;
        for(int i=0;i<count0;i++){
            nums[index++]=0;

        }
        for(int i=0;i<count1;i++){
            nums[index++]=1;
        }
        for(int i=0;i<count2;i++){
            nums[index++]=2;
        }

    }
    public static void sortColors2(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
       while (mid<=high) {
           if (nums[mid] == 0) {
               swap(nums, low, mid);
               low++;
               mid++;
           }
           else if (nums[mid] == 1) {
               mid++;
           }
           else if (nums[mid] == 2) {
               swap(nums, high, mid);
               high--;

           }
       }
       }


    static void swap(int[] arr,int a,int b){
        int temp= arr[a];
        arr[a] =arr[b];
        arr[b]=temp;
    }
}

