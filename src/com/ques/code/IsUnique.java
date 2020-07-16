/*
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use data structures?
 */

package com.ques.code;

import java.util.Scanner;

public class IsUnique {

    public static void main(String... args) {

    
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        //String check="";
        boolean isUnique = true;
        for(int i=0;i<word.length();i++){

            char ch = word.charAt(i);
            if(word.indexOf(String.valueOf(ch)) != word.lastIndexOf(String.valueOf(ch))) {
                isUnique=false;
                break;
            }
        }

        if(isUnique)
            System.out.println("Is Unique");
        else
            System.out.println("Not Unique");

    }

}
