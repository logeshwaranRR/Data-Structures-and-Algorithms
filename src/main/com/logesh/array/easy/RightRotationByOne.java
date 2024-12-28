package src.main.com.logesh.array.easy;


import java.util.Arrays;

public class RightRotationByOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));
        rightRotateByOne(array);
        System.out.println("Array after Right Rotation by One: " + Arrays.toString(array));
    }

    public static void rightRotateByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No rotation needed for null or single-element arrays
        }

        int lastElement = arr[arr.length - 1]; // Save the last element
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }
        arr[0] = lastElement; // Place the last element at the first position
    }
}
