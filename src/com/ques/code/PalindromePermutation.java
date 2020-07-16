/*
 * Given a string write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome need not to be limited to just dictionary words.
 *
 * example;
 * input: "Tact Coa"
 * output: True ( permutations: "taco cat", "atco cta" etc)
 */

package com.ques.code;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromePermutation {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String word = sc.nextLine();

        Set<Character> set = new HashSet<>();
        int k=0;

        for(char ch : word.toLowerCase().toCharArray()){
            if(ch != ' ') {
                if (set.contains(ch)) {
                    k--;
                } else {
                    set.add(ch);
                    k++;
                }
            }
        }
        if(k>=-1 && k<=1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
