package src.main.com.logesh.array.easy;
//https://bit.ly/3Pld280
public class LargestElement {
    public static void main(String[] args){
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println("Largest element in array is "+largest(arr));

    }

    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }
}
