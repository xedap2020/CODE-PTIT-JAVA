/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.mang;

import java.util.Scanner;

public class tichMaTranChuyenVi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Đọc số bộ test
        int numTests = scanner.nextInt();
        for (int test = 1; test <= numTests; test++) {
            
            // Đọc kích thước ma trận
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            // Đọc giá trị của ma trận A
            int[][] matrixA = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrixA[i][j] = scanner.nextInt();
                }
            }
            
            // Tính ma trận chuyển vị của A
            int[][] matrixATranspose = transposeMatrix(matrixA, n, m);
            
            // Tính tích của A với ma trận chuyển vị của A
            int[][] matrixProduct = multiplyMatrices(matrixA, matrixATranspose, n, m, m);
            
            System.out.println("Test " + test + ":");
            // In ra ma trận tích
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrixProduct[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
    
    public static int[][] transposeMatrix(int[][] matrix, int n, int m) {
        int[][] transpose = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int n, int m, int p) {
        int[][] product = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < m; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
}

