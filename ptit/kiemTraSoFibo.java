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
public class kiemTraSoFibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            
            String result = isFibonacci(n) ? "YES" : "NO";
            
            System.out.println(result);
        }
        scanner.close();
    }

    private static boolean isFibonacci(long n) {
        long fibPrev = 0;
        long fibCurr = 1;
        
        while (fibCurr <= n) {
            if (fibCurr == n) {
                return true;
            }

            long fibNext = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = fibNext;
        }
        
        return false;
    }
}
