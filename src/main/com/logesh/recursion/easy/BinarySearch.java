package src.main.com.logesh.recursion.easy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        int start =0;
        int end = arr.length-1;
        int  index = binarySearch(arr,target,start,end);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
    if(start<=end) {
        int mid = start+((end - start) / 2);
        if (arr[mid] == target) {
            return mid;

        }
        if(target<arr[mid]){
            return binarySearch(arr,target,start,mid-1);
        }else{
            return binarySearch(arr,target,mid+1,end);
        }
    }

        return -1;


    }


}
