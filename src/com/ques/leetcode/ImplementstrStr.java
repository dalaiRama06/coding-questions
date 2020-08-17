/*
    Implement strStr().
    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Example 1:
    Input: haystack = "hello", needle = "ll"
    Output: 2

    Example 2:
    Input: haystack = "aaaaa", needle = "bba"
    Output: -1
 */

package com.ques.leetcode;

public class ImplementstrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
    public static int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if (nlen == 0)
            return 0;
        if (hlen == 0 || nlen > hlen)
            return -1;
        int i = 0;
        boolean f = false;
        while (i <= hlen - nlen) {
            String s = haystack.substring(i, i + nlen);
            if (s.equals(needle)) {
                f = true;
                break;
            }
            i++;
        }
        return f ? i : -1;
    }
}
