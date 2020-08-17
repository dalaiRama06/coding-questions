/*
    Implement a method to perform basic string compression using the count of the repeated characters.
    For eg. the string aabcccccaaa would be come a2b1c5a3. If the compressed string would not become smaller
    than the original then the method should return the original string.
    You can assume the string has ony uppercase and lowercase characters.
 */
package com.ques.code;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(stringCompression(s));

    }

    private static String stringCompression(String s) {
        int i = 0, k = 0;
        String res = "";
        while (i + k < s.length()) {
            if (s.charAt(i) == s.charAt(i + k))
                k++;
            else {
                res += s.charAt(i) + String.valueOf(k);
                i = i + k;
                k = 1;
            }
        }
        res += s.charAt(i) + k;

        return res.length() < s.length() ? res : s;
    }
}
