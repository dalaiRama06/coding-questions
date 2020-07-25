/*
    Given a 32-bit signed integer, reverse digits of an integer.

    Example 1:
    Input: 123
    Output: 321

    Example 2:
    Input: -123
    Output: -321

    Example 3:
    Input: 120
    Output: 21

    Note:
    Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
    For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

package com.ques.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverse(120));
    }

    public static int reverse(int x) {

        long m = 0;
        int k = x;
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE)
            return 0;
        else {
            if (x < 0)
                k = x * -1;
            while (k > 0) {
                m = (m * 10) + (k % 10);
                k = k / 10;
            }

            if (m > Integer.MAX_VALUE)
                m = 0;
            if (x < 0)
                return (int) m * -1;
            return (int) m;
        }
    }
}
