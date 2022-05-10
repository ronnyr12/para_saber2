package com.company;

public class Q3 {
    public static void main(String[] args) {
        int[][] mtrx = {
                {11, 9, 14, 8},
                {6, 23, 30, 5},
                {1, 27, 10, 3}};
        System.out.println(solution3(mtrx));

    }

    public static boolean solution3(int[][] matrix) {
        if (matrix[matrix.length - 1].length % 2 != 0)
            return false;
        for (int row = 0; row < matrix.length; row++) {
            for (int i = 0, j = matrix.length - 1; i < (matrix.length / 2) - 1; i++, j--) {
                if (!isPrime(matrix[row][i] + matrix[row][j]))
                    return false;
            }
        }
        return true;
    }

    /**
     * custom method
     *
     * @param num
     * @return true if num is a prime number
     */
    public static boolean isPrime(int num) {
        int dividers = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                dividers++;
        }
        return (dividers == 2);

    }
}
