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
public class maTranNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numRows = scanner.nextInt();
        
        int[][] matrix = new int[numRows][3];
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int count = countRowsWithMoreOnes(matrix, numRows);
        System.out.println(count);

        scanner.close();
    }

    private static int countRowsWithMoreOnes(int[][] matrix, int numRows) {
        int count = 0;
        
        for (int i = 0; i < numRows; i++) {
            int ones = 0;
            int zeros = 0;

            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 1) {
                    ones++;
                } else {
                    zeros++;
                }
            }

            if (ones > zeros) {
                count++;
            }
        }
        return count;
    }
}
