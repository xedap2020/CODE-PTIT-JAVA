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
public class boiSoNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numTests = scanner.nextInt();
        
        for (int t = 1; t <= numTests; t++) {
            
            int n = scanner.nextInt();

            long smallestMultiple = findSmallestMultiple(n);
            System.out.println(smallestMultiple);
        }    
        scanner.close();
    }
    
    // Hàm tìm số nguyên nhỏ nhất chia hết cho các số từ 1 đến n
    public static long findSmallestMultiple(int n) {
        long smallestMultiple = 1;

        for (int i = 1; i <= n; i++) {
            smallestMultiple = lcm(smallestMultiple, i);
        }

        return smallestMultiple;
    }
    
    // Hàm tìm bội chung nhỏ nhất của hai số
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
