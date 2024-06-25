package src.main.com.logesh.strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains methods to generate all subsets of an array.
 */
public class SubSet {

    /**
     * Main method to test the subset methods.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // System.out.println(subset(new int[]{1,2,3}) );
        System.out.println(subsetDuplicate(new int[]{1,2,2}) );
    }

    /**
     * Generates all subsets of an array without considering duplicates.
     *
     * @param arr the input array
     * @return a list of lists representing all subsets
     */
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n=outer.size();
            for(int i=0; i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    /**
     * Generates all subsets of an array considering duplicates.
     *
     * @param arr the input array
     * @return a list of lists representing all subsets
     */
    public static List<List<Integer>> subsetDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        int start=0;
        int end = 0;
        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            start=0;
            if (i>0 && arr[i]==arr[i-1]){
                start=end-1;
            }
            end=outer.size();
            for(int j=start; j<end; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
