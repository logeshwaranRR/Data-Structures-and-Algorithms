package src.main.com.logesh.array.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        System.out.println(linearSearch(arr,0));
    }

    private static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1; // element not found
    }
}
