/*
    There are three types of edits that can be performed on strings: insert a character, remove a character
    or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

    example:
    pale, ple -> true
    pales, pale -> true
    pale, bale -> false
    pale, bake -> false
 */
package com.ques.code;

import java.util.Scanner;

public class OneAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isOneAway(s1, s2));
    }

    public static boolean isOneAway(String s1, String s2) {

        if (Math.abs(s1.length() - s2.length()) > 1)
            return false;
        else {
            boolean diff = false;
            String f1 = s1.length() < s2.length() ? s1 : s2;
            String f2 = s1.length() < s2.length() ? s2 : s1;

            int in1 = 0, in2 = 0;
            while (in1 < f1.length() && in2 < f2.length()) {

                if (f1.charAt(in1) != f2.charAt(in2)) {
                    if (diff)
                        return false;

                    diff = true;
                    if (f1.length() == f2.length())
                        in1++;
                } else {
                    in1++;
                }
                in2++;
            }

            return true;
        }
    }

}