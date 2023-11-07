package org.matrix;

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


        public int[][] createSquareMatrix(int size){
            int[][] tempMatrix = new int[size][size];
            for (int i = 0; i < tempMatrix.length; i++) {

                for (int j = 0; j < tempMatrix[i].length; j++) {

                    tempMatrix[i][j] =(j + 1) + tempMatrix[i].length * i;
                }
            }
            printMatrix(tempMatrix);
            return tempMatrix;
        }


}
