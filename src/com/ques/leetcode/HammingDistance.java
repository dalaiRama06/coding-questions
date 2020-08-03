/*
    The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
    Given two integers x and y, calculate the Hamming distance.
    Note:
    0 ≤ x, y < 231.

    Example:
    Input: x = 1, y = 4
    Output: 2
    Explanation:
    1   (0 0 0 1)
    4   (0 1 0 0)
           ↑   ↑
    The above arrows point to positions where the corresponding bits are different.
 */
package com.ques.leetcode;

public class HammingDistance {

    public static void main(String[] args) {

        System.out.println(hammingDistance(1,4));
        System.out.println(hammingDistanceBestRuntime(1,4));
    }

    public static int hammingDistance(int x, int y) {
        int z= x^y;
        String s = Integer.toBinaryString(z);
        z=0;
        for(char c: s.toCharArray())
            if(c=='1')
                z++;
        return z;
    }

    public static int hammingDistanceBestRuntime(int x, int y) {
        int xor = x^y;
        int count = 0;
        while (xor > 0) {
            if ((xor&1) == 1) {
                count ++;
            }
            xor = xor >> 1;
        }
        return count;
    }
}
