/*
    Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
    The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
    You may assume the integer does not contain any leading zero, except the number 0 itself.

    Example 1:
    Input: [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.

    Example 2:
    Input: [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
 */

package com.ques.leetcode;

public class PlusOne {

    public static void main(String[] args) {
        int[] dig = {4, 3, 2, 1};

        int[] result = plusOne(dig);

        for (int n : result)
            System.out.println(n);
    }

    public static int[] plusOne(int[] digits) {

        int i = digits.length - 1, k = 0;
        digits[i] = digits[i] + 1;

        while (i > -1) {
            if (digits[i] > 9 && i == 0) {
                int[] res = new int[digits.length + 1];
                res[0] = 1;
                digits[i] = 0;
                for (k = 0; k < digits.length; k++) {
                    res[k + 1] = digits[k];
                }
                return res;
            } else if (digits[i] > 9) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            } else {
                break;
            }
            i--;
        }

        return digits;
    }
}
