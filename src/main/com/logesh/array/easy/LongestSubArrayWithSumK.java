package src.main.com.logesh.array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {

        int[] arr = {2,3,5};
        int k=5;
        int n=3;
//        System.out.println(bruteForce(arr,k,n));
//        System.out.println(betterBruteForce(arr,k,n));
//        System.out.println(betterApproach(arr,k,n));
        System.out.println(optimalApproach(arr,k,n));
    }
    static int bruteForce(int[] arr,int m,int n){
        int maxLen=Integer.MIN_VALUE;
        int start=0,end=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==m){
                    maxLen=Math.max(maxLen,j-i+1);
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,start,end+1)));
        return maxLen;
    }

    static int betterBruteForce(int[] arr,int m,int n){
        int maxLen=Integer.MIN_VALUE;
        int start=0,end=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==m){
                    maxLen=Math.max(maxLen,j-i+1);
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,start,end+1)));
        return maxLen;
    }

    static int betterApproach(int[] arr,int m,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==m){
                 maxLen=Math.max(maxLen,i+1);
            }
            int rem = sum-m;
            if(map.containsKey(rem)){
                int s=map.get(rem);
               maxLen= Math.max(maxLen,s-i);
            }
            if(!map.containsKey(rem)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    static int optimalApproach(int[] arr,int m,int n){
        int maxLen=Integer.MIN_VALUE;
        int right=0;
        int left=0;
        int sum=0;
       
        while(right<n){
            sum+=arr[right];
            if(sum==m){
                maxLen=Math.max(maxLen,right-left+1);
            }
            while(sum>m && left<=right){
                sum-=arr[left];
                left++;
            }
            right++;
        }
        return maxLen;
    }
}
