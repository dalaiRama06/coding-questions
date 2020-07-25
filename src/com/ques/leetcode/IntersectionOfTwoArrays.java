/*
    Given two arrays, write a function to compute their intersection.

    Example 1:
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]

    Example 2:
    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [4,9]

    Note:
    Each element in the result should appear as many times as it shows in both arrays.
    The result can be in any order.
 */

package com.ques.leetcode;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);

        for (int n : result)
            System.out.println(n);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0, p2 = 0;
        int c = 0;
        int[] res = new int[Math.min(nums1.length, nums2.length)];

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2])
                p1++;
            else if (nums1[p1] > nums2[p2])
                p2++;
            else {
                res[c] = nums1[p1];
                c++;
                p1++;
                p2++;
            }
        }

        return Arrays.copyOfRange(res, 0, c);
    }
}
