package org.matrix;

public class MainClassMatrix {
    public static void main(String[] args) {
        /** 1 2 3
         4 5
         7 8 9 10

         Square matrix
         3 1 3
         1 3 1
         3 1 3

         Priamokuhtna matrix
         1 2 3 4
         5 6 7 8

         1 2
         3 4
         5 6
         */

        int[][] matrix={{1,2,3},{4,5},{7,8,9,10}};
        System.out.println("Number of rows = " + matrix.length);
        System.out.println("Number of elements in 3 element (index 2) row = " + matrix[2].length);
        System.out.println("Element  = " + matrix[2][2]);
        //System.out.println(matrix);

        WorkWithMatrix workWithMatrix = new WorkWithMatrix();
        workWithMatrix.printMatrix(matrix);

        int[][] matrix_2 = new int[4][4];
        workWithMatrix.printMatrix(matrix_2);
        matrix_2[1][2] = 5;
        workWithMatrix.printMatrix(matrix_2);
//      matrix_2[-3][100] = 3;

workWithMatrix.createSquareMatrix(5);








    }
}
