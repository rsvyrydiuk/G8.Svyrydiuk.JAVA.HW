package org.homework4.matrix;

public class MainClassMatrix {
    public static void main(String[] args) {
        /**
         * Part 1.
         * - In the WorkWithMassive class, create a method that will create a matrix (type int[][]) and fill it with a specified value (the size of the matrix and values are transferred from the main program, for example, in size NxM (for example, 3x3 or 5x7) and fill it with a specified value, for example 8.). After filling, output to the console and return it. If the size 0 was passed, then display the message that "The side cannot be 0", replace this value with 1 and create a matrix. That is, if we transferred 5x0, we will get a 5x1 matrix
         * - Also in this class, create a fillingOfLeftDiagonal method - the method must accept as input a matrix (Any matrix, not necessarily created by the previous method) and a value for filling. Check if it is square. If so, then fill the diagonal with the transferred value, output to the console and return the matrix. If it is not square, display the message "The matrix is not square" and return the unchanged matrix
         * - Also in this class, create a fillingOfRightDiagonal method - similar to fillingOfLeftDiagonal, but fill the right diagonal
         * - Create a method for filling the values of two diagonals at once with the transferred value (do not duplicate the code, but call already created methods - fill the left and then the right diagonal)
         * - For the output, use the method of outputting the matrix to the console in a "beautiful form" - the one we created in class.
         * In the main program, perform the following actions:
         * 1.1 in the main program, we create a matrix using the usual calculation
         * 1 1 1
         * 1 1 1
         * 1 1 1
         *   1.2 fill in the left diagonal in the previous matrix
         * 8 1 1 - left diagonal
         * 1 8 1
         * 1 1 8
         * 1.3 we create another 4 by 4 matrix and fill 2 using the creation method and pass it to the right diagonal filling method with the value 9
         * 2 2 2 9 - right diagonal
         * 2 2 9 2
         * 2 9 2 2
         * 9 2 2 2
         *
         * 1.4 we create another 3 by 3 matrix, fill it with 4 and pass it to the input of the method for filling 2 diagonals at once with the value 7
         *
         * 7 4 7
         * 4 7 4
         * 7 4 7
         *
         * 1.5 we create a 0 by 4 matrix and fill in 5
         * should get the message and the matrix
         * 5 5 5 5
         *
         * 1.6 create a 2 by 4 matrix, fill in 9 using the matrix creation method and try to fill the left diagonal
         * we will receive a message and an unchanged matrix
         * 9 9 9 9
         * 9 9 9 9
         *
         * make it so that when the method for filling two diagonals is called, output does not occur twice (left, then two), but only two diagonals. That is, use the "check box" to disable printing.
         *
         *
         */


        WorkWithMatrix workWithMatrix = new WorkWithMatrix();

        //1.1
        int[][] matrix = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        workWithMatrix.printMatrix(matrix);


        //1.2

        workWithMatrix.fillingOfLeftDiagonal(matrix, 8, true);

        //1.3

        int[][] matrix_2 = workWithMatrix.creatematrix(4, 4, 2);
        workWithMatrix.fillingOfRightDiagonal(matrix_2, 9, true);

        //1.4

        int[][] matrix_3 = workWithMatrix.creatematrix(3, 3, 4);
        workWithMatrix.fillingOfTwoDiagonals(matrix_3, 7);

        //1.5

        workWithMatrix.creatematrix(0, 4, 5);

        workWithMatrix.creatematrix(2, 0, 5);

        //1.6

        int[][] matrix_4 = workWithMatrix.creatematrix(2, 4, 9);

        workWithMatrix.fillingOfLeftDiagonal(matrix_4, 0, true);



        int[][] matrix_5 = {{1, 1, 1}, {}, {1, 1, 1}};

        workWithMatrix.fillingOfLeftDiagonal(matrix_5, 0, true);


    }
}
