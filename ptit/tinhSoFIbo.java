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
public class tinhSoFIbo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            
            long result = fibonacci(n);
            
            System.out.println(result);
        }
        scanner.close();
    }

    private static long fibonacci(int n) {
        if(n<=2){
            return 1;
        }
        
        long fibPrev = 1;
        long fibCurr = 1;
        long fibN = 0;
        
        for (int i = 3; i <= n; i++) {
            fibN = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = fibN;
        }
        
        return fibN;
    }
}
