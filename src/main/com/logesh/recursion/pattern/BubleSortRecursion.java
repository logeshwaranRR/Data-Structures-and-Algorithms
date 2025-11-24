package src.main.com.logesh.recursion.pattern;

import java.util.Arrays;

public class BubleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {0,4,3,2,1};
        bubleSort(arr,4,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubleSort(int[] arr, int row, int col) {
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp= arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubleSort(arr,row,col+1);
        }else{
            bubleSort(arr,row-1,0);
        }
    }
}
