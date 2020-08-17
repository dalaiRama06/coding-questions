/*
    Given two strings s and t , write a function to determine if t is an anagram of s.

    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:
    Input: s = "rat", t = "car"
    Output: false

    Note:
    You may assume the string contains only lowercase alphabets.
 */
package com.ques.leetcode;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {

        int[] a = new int[256];

        for (char ch : s.toCharArray()) {
            a[ch]++;
        }

        for (char ch : t.toCharArray()) {
            a[ch]--;
        }

        for (int i : a) {
            if (i != 0)
                return false;
        }

        return true;
    }
}
