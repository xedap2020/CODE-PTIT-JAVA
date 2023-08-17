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
public class xauNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            
            String[] X = new String[N];
            X[0] = "0";
            X[1] = "1";
            
            for (int j = 2; j < N; j++) {
                X[j] = X[j-2] + X[j-1];
            }
            
            char character = X[N-1].charAt(K-1);
            System.out.println(character);
        }
        scanner.close();
    }
}
