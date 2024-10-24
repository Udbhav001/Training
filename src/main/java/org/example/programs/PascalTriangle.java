package org.example.programs;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        createPascalTriangle(n);
    }

    private static void createPascalTriangle(int n) {
        int[][] arr = new int[n][n];
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++) {
                if (line == i || i == 0)
                    arr[line][i] = 1;
                else
                    arr[line][i] = arr[line - 1][i - 1] + arr[line - 1][i];
                System.out.print(arr[line][i] + " ");
            }
            System.out.println();
        }
    }
}
