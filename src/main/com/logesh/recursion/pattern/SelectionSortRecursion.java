package src.main.com.logesh.recursion.pattern;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr={0,4,3,2,1,7,11,6};
        selectionsSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionsSort(int[] arr, int row, int col, int max) {
    if(row==1){
        return;
    }
    if(row>col){
        if (arr[col]>arr[max]){
            max=col;
        }
        selectionsSort(arr,row,col+1,max);
    }else{
        int temp=arr[row-1];
        arr[row-1]=arr[max];
        arr[max]=temp;
        selectionsSort(arr,row-1,0,0);
    }
    }
}
