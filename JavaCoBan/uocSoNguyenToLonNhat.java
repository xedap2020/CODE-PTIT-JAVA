/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.JavaCoBan;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class uocSoNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            long N = scanner.nextLong();
            
            // Tìm ước số nguyên tố lớn nhất của N
            long largestPrimeFactor = findLargestPrimeFactor(N);
            
            System.out.println(largestPrimeFactor);
        }
        scanner.close();
    }

    private static long findLargestPrimeFactor(long N) {
        long largestPrime = 1;
        
        
        // Kiểm tra xem N có chia hết cho 2 không
        while (N % 2 == 0) {
            largestPrime = 2;
            N /= 2;
        }
        
        // Kiểm tra các ước số lẻ cho đến khi N trở thành số nguyên tố
        for (long i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                largestPrime = i;
                N /= i;
            }
        }
        
        if (N > 1) {
            largestPrime = N;
        }
        
        return largestPrime;
    }
}
