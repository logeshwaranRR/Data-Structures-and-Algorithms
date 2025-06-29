package src.main.com.logesh.array.easy;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1489463517/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
      int k = obj.removeDuplicates(arr);
      for(int i=0;i<k;i++){
          System.out.println(arr[i]);
      }

    }

    public int removeDuplicates(int[] nums) {
    int i=0;
    for(int j=1;j<nums.length;j++){
        if(nums[i]<nums[j]){
            i++;
            nums[i] = nums[j];
        }
    }
    return i+1;
    }
}
