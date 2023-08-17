/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.ptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class chiaTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            int H = scanner.nextInt();
            
            // tinh dien tich tam giac
            double area = 0.5 * 1 * H;
            
            for (int j = 1; j < N; j++) {
                double distance = Math.sqrt((double) j / N * 2 * area);
                System.out.printf("%.6f ", distance);
            }
            System.out.println();
        }
        scanner.close();
    }
}
