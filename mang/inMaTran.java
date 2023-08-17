/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.mang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class inMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numTests = scanner.nextInt();
        
        for (int t = 1; t <= numTests; t++) {

            int n = scanner.nextInt();

            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            
            printMatrixInPattern(matrix, n);
        }

        scanner.close();
    }

    // Hàm in ma trận theo yêu cầu
    private static void printMatrixInPattern(int[][] matrix, int n) {
        StringBuilder[] rows = new StringBuilder[n];
        
        for (int i = 0; i < n; i++) {
            rows[i] = new StringBuilder();

            if (i % 2 == 0) { // Dòng chẵn: in từ trái qua phải
                for (int j = 0; j < n; j++) {
                    rows[i].append(matrix[i][j]).append(" ");
                }
            } else { // Dòng lẻ: in từ phải qua trái
                for (int j = n - 1; j >= 0; j--) {
                    rows[i].append(matrix[i][j]).append(" ");
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rows[i]);
        }
        System.out.println();
    }
    
}
