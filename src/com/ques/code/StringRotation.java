/*
    Assume you have a method isSubstring which checks if one word is a substring of another.
    Given two string s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring
    e.g "waterbottle" is a rotation of "erbottlewat"
 */
package com.ques.code;

public class StringRotation {

    public static void main(String[] args) {
        System.out.println(stringRotation("waterbottle", "erbottlewat"));
    }

    private static boolean stringRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        else
            return isSubstring(s2 + s2, s1);
    }

    public static boolean isSubstring(String s1, String s2) {
        return s1.indexOf(s2) > 0;
    }
}
