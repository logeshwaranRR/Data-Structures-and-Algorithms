package src.main.com.logesh.array.easy;

import java.util.ArrayList;
import java.util.List;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 3};
        int[] arr2={2, 2,4};
        System.out.println(sortedArray(arr1, arr2));

    }

    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int i=0;
        int j=0;
        int m = a.length;
        int n = b.length;
        List<Integer> union = new ArrayList<Integer>();
        while(i<m && j<n){
            if(a[i]<=b[j]){
                if(union.size() == 0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i<m){
            if(union.size() == 0 || union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
            }
            i++;
        }
        while(j<n){
            if(union.size() == 0 || union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
            }
            j++;
        }

        return union;


    }
}
