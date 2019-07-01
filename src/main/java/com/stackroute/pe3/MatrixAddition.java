package com.stackroute.pe3;

public class MatrixAddition {

    public static int[][] addMatrices (int rows,int columns,int[][] matrix1,int[][] matrix2) {

        int sum[][]= new int[rows][columns];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }

}
