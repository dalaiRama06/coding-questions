/*
    Given an array, rotate the array to the right by k steps, where k is non-negative.

    Example 1:
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]

    Example 2:
    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]

    Constraints:
    1 <= nums.length <= 2 * 10^4
    It's guaranteed that nums[i] fits in a 32 bit-signed integer.
    k >= 0
 */
package com.ques.leetcode;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {-1, -100, 1, 99};
        int k = 2;
        rotate(nums, k);

        for (int n : nums)
            System.out.println(n);
    }

    public static void rotate(int[] nums, int k) {

        while (k > 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];

            }
            nums[0] = temp;
            k--;
        }

    }
}
