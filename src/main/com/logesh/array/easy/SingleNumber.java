package src.main.com.logesh.array.easy;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
        System.out.println(betterSolution(nums));
    }

    public static int singleNumber(int[] nums) {
        int XOR = 0;
        for (int num : nums) {
            XOR ^= num;
        }
        return XOR;
    }

    public static int betterSolution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num).equals(1)) {
                return num;
            }
        }
        return -1;
    }
}
