/*
 * write a method to replace all spaces in a string wih '%20'.
 * you may assume that the string has sufficient space at the the end to hold the additional characters,
 * and that you are given the "true" length if the string.
 *
 * example:
 * input: "Mr John Smith    ", 13
 * output: "Mr%20John%20Smith"
 */

package com.ques.code;

import java.util.Scanner;

public class URLify {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        int len = sc.nextInt();

        char[] ch = url.toCharArray();
        int tlen = url.length();

        for (int i = len-1; i >=0; i--) {

            if(ch[i] != ' '){
                ch[tlen-1] = ch[i];
                tlen--;
            }
            else{
                ch[--tlen] = '0';
                ch[--tlen]='2';
                ch[--tlen]='%';
            }
        }

        for(char c: ch)
            System.out.print(c);
    }
}
