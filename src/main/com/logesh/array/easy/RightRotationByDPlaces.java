package src.main.com.logesh.array.easy;
import java.util.Arrays;
public class RightRotationByDPlaces {



        // Function to perform right rotation
        public static void rightRotate(int[] arr, int d) {
            int n = arr.length;

            // Normalize d to avoid unnecessary rotations
            d = d % n;

            // Temporary array to hold the rotated values
            int[] rotated = new int[n];

            // Copy the last d elements to the beginning of the array
            System.arraycopy(arr, n - d, rotated, 0, d);

            // Copy the first (n-d) elements to the end of the rotated array
            System.arraycopy(arr, 0, rotated, d, n - d);

            // Copy the rotated array back to the original array
            System.arraycopy(rotated, 0, arr, 0, n);
        }

        // Example usage
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int d = 3;

            System.out.println("Original Array: " + Arrays.toString(arr));

            // Perform right rotation
            rightRotate(arr, d);
            System.out.println("Array after right rotation: " + Arrays.toString(arr));
            rightRotateOptimal(arr, d);

            // Print the rotated array

        }

    // Function to reverse a part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to perform right rotation
    public static void rightRotateOptimal(int[] arr, int d) {
        int n = arr.length;

        // Normalize d to avoid unnecessary rotations
        d = d % n;

        if (d == 0) {
            return;  // No rotation needed
        }
        System.out.println(Arrays.toString(arr));
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

        // Reverse the first d elements
        reverse(arr, 0, d - 1);
        System.out.println(Arrays.toString(arr));
        // Reverse the remaining n - d elements
        reverse(arr, d, n - 1);
        System.out.println(Arrays.toString(arr));
    }
    }


