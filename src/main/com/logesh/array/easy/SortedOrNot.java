package src.main.com.logesh.array.easy;
//https://www.naukri.com/code360/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=SUBMISSION
public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,1};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        for(int i= 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
