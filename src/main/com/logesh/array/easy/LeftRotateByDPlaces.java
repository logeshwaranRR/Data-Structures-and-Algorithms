package src.main.com.logesh.array.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        leftRotate(arr, d);
        optimalSol(arr, d);
    }

    static void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        if (n == 0) return;
        d = d % n;
        if (d == n) return;

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }

        System.out.println(Arrays.toString(arr));
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    static void optimalSol(int arr[], int d){
        int n=arr.length;
        if(n==0) return;
        d=d%n;
        if(d==0) return;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println("from optimal mtd: "+Arrays.toString(arr));

    }

    private static void reverse(int[] arr, int start, int end) {
        while(start <= end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

