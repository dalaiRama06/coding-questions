/*
    Write an algorithm such that if an element in an MxN matrix is 0,
    its entire row and column are set to zero.
 */

package com.ques.code;

import java.util.Scanner;

public class ZeroMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] num = new int[n][m];
        int k = 1, i, j;

        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++) {
                num[i][j] = k;
                k++;
            }

        num[0][1] = 0;
        num[2][3] = 0;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.print(num[i][j] + " ");
            System.out.println();
        }

        System.out.println();

        zeroMatrix(num);

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.print(num[i][j] + " ");
            System.out.println();
        }
    }

    private static void zeroMatrix(int[][] num) {

        boolean rowZero = false;
        boolean columnZero = false;

        int i, j;

        for (i = 0; i < num[0].length; i++)
            if (num[0][i] == 0) {
                rowZero = true;
                break;
            }

        for (j = 0; j < num.length; j++)
            if (num[j][0] == 0) {
                columnZero = true;
                break;
            }

        for (i = 1; i < num.length; i++) {
            for (j = 1; j < num[0].length; j++) {
                if (num[i][j] == 0) {
                    num[0][j] = 0;
                    num[i][0] = 0;
                }
            }
        }

        for (i = 0; i < num[0].length; i++)
            if (num[0][i] == 0)
                zeroColumn(num, i);

        for (i = 0; i < num.length; i++)
            if (num[i][0] == 0)
                zeroRow(num, i);

        if (rowZero)
            zeroRow(num, 0);

        if (columnZero)
            zeroColumn(num, 0);

    }

    public static void zeroRow(int[][] num, int i) {
        for (int k = 0; k < num[0].length; k++) {
            num[i][k] = 0;
        }
    }

    public static void zeroColumn(int[][] num, int i) {
        for (int k = 0; k < num.length; k++) {
            num[k][i] = 0;
        }
    }
}
