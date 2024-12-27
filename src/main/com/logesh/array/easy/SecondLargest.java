package src.main.com.logesh.array.easy;

//https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {12, 35, 1, 10, 34, 1};
        SecondLargest s = new SecondLargest();
        System.out.println("Second largest element is: " + s.getSecondLargest(arr));
        System.out.println("Second smallest element is: " + getSecondSmallest(arr));
    }
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>largest ){
                secondLargest=largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int getSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest=arr[i];
            }else if(arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
