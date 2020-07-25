/*
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.
    Note:Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    Example 1:
    Input: [2,2,1]
    Output: 1

    Example 2:
    Input: [4,1,2,1,2]
    Output: 4
 */

package com.ques.leetcode;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1)
                return nums[i];
            else if (nums[i] != nums[i + 1])
                return nums[i];
        }
        return 0;
    }
}
