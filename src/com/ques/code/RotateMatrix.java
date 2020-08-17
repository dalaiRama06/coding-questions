/*
    Given an image represented by an NxM matrix, where each pixel in the image is 4 bytes, write a method
    to rotate the image by 90 degrees. Can you do this in place?
 */
package com.ques.code;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int k = 1;
        int[][] image = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                image[i][j] = k;
                k++;
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(image[i][j] + " ");
            System.out.println();
        }

        rotateMatrix(image);
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(image[i][j] + " ");
            System.out.println();
        }
    }

    private static void rotateMatrix(int[][] image) {

        for (int l = 0; l < image.length / 2; l++) {
            int first = l;
            int last = image.length - 1 - l;
            for (int i = first; i < last; i++) {
                int top = image[first][i];
                image[first][i] = image[image.length - 1 - i][first];
                image[image.length - 1 - i][first] = image[last][image.length - 1 - i];
                image[last][image.length - 1 - i] = image[i][last];
                image[i][last] = top;
            }
        }
    }
}
