/*
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.

    Example 1:
    Input: "A man, a plan, a canal: Panama"
    Output: true

    Example 2:
    Input: "race a car"
    Output: false
 */

package com.ques.leetcode;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(char ch: s.toLowerCase().toCharArray()){

            if((ch>96 && ch<123) || (ch>47 && ch<58))
                sb.append(ch);
        }

        String sb1 = sb.toString();
        sb.reverse();

        if(sb1.equals(sb.toString()))
            return true;
        else
            return false;

    }
}