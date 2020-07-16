/**
 * Given two strings, write a method to decide if one is permutation of the other.
 */

package com.ques.code;

import java.util.Scanner;

public class CheckPermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        if(word1.length() != word2.length()){
            System.out.println("Not Permutation");
        }
        else{
            boolean check=true;
            for(int i=0;i<word1.length();i++){
                if(word1.indexOf(String.valueOf(word2.charAt(i)))<0) {
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.println("Is Permutation");
            else
                System.out.println("Not Permutation");
        }
    }
}
