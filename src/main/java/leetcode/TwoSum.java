package leetcode;

import java.util.Arrays;
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[] {10};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 7, 11, 15};
        int[] arr2 = new int[] {3, 3};
        int[] arr3 = new int[] {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
        System.out.println(Arrays.toString(twoSum(arr3, 6)));
    }
}
