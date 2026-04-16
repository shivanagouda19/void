package arr;

import java.util.*;
import arr.twoSum.Solution;

public class twoSum {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] {};
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int resultarray[] = s1.twoSum(new int[] { 1, 4, 2, 5, 9 }, 7);
        for (int i = 0; i < resultarray.length; i++) {
            System.out.println(resultarray[i]);
        }
    }
}
