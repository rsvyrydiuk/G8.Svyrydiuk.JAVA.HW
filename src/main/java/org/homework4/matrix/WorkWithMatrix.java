package org.homework4.matrix;

public class WorkWithMatrix {
    public void printMatrix(int[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int[][] creatematrix(int width, int height, int value) {

        if (width == 0) {
            System.out.println("The side cannot be 0");
            width = 1;

        } else if (height == 0) {
            System.out.println("The side cannot be 0");
            height = 1;
        }
        int[][] tempMatrix = new int[width][height];


        for (int i = 0; i < tempMatrix.length; i++) {

            for (int j = 0; j < tempMatrix[i].length; j++) {

                tempMatrix[i][j] = value;
            }
        }
        printMatrix(tempMatrix);
        return tempMatrix;
    }

    public int[][] fillingOfLeftDiagonal(int[][] matrix, int value, boolean printMatrix) {
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = value;
            }
            if (printMatrix == true) {
                printMatrix(matrix);
            }
        } else {
            System.out.println("The matrix is not square");
        }
        return matrix;
    }

    public int[][] fillingOfRightDiagonal(int[][] matrix, int value, boolean printMatrix) {
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][matrix.length - 1 - i] = value;
            }
            if (printMatrix == true) {
                printMatrix(matrix);
            }

        } else {
            System.out.println("The matrix is not square");
        }
        return matrix;
    }


    public int[][] fillingOfTwoDiagonals(int[][] matrix_3, int i, boolean printMatrix) {
        int[][] matrix_4 = fillingOfLeftDiagonal(matrix_3, i, printMatrix);
        int[][] matrix_5 = fillingOfRightDiagonal(matrix_4, i, printMatrix);
        printMatrix(matrix_5);
        return matrix_5;

    }
}
