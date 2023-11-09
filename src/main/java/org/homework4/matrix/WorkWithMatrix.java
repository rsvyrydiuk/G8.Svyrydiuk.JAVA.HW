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

    public int checkMatrixside(int side) {
        if (side == 0) {
            System.out.println("The side cannot be 0");
            side = 1;
        }
        return side;
    }

    public int[][] creatematrix(int width, int height, int value) {


        int[][] tempMatrix = new int[checkMatrixside(width)][checkMatrixside(height)];


        for (int i = 0; i < tempMatrix.length; i++) {

            for (int j = 0; j < tempMatrix[i].length; j++) {

                tempMatrix[i][j] = value;
            }
        }
        printMatrix(tempMatrix);
        return tempMatrix;
    }


    public boolean checkSquareMatrixSide(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                System.out.println("The matrix is not square");
                return false;
            }
        }
        return true;
    }


    public int[][] fillingOfLeftDiagonal(int[][] matrix, int value, boolean printMatrix) {
        if (checkSquareMatrixSide(matrix) == true) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = value;
            }
        }

        if (printMatrix == true) {
            printMatrix(matrix);
        }
        return matrix;
    }


    public int[][] fillingOfRightDiagonal(int[][] matrix, int value, boolean printMatrix) {
        if (checkSquareMatrixSide(matrix) == true) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][matrix.length - 1 - i] = value;
            }
        }
        if (printMatrix == true) {
            printMatrix(matrix);
        }
        return matrix;
    }


    public int[][] fillingOfTwoDiagonals(int[][] matrix_3, int i) {
        int[][] matrix_4 = fillingOfLeftDiagonal(matrix_3, i, false);
        int[][] matrix_5 = fillingOfRightDiagonal(matrix_4, i, true);
        return matrix_5;

    }
}
