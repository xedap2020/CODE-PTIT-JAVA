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
public class so0LienKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long N = scanner.nextLong();
            long sumOfDigits = calculateSumOfDigits(N);
            boolean isSumDivisibleBy10 = sumOfDigits % 10 == 0;
            boolean hasDistinctAdjacentDigits = checkDistinctAdjacentDigits(N);
            
            if (isSumDivisibleBy10 && hasDistinctAdjacentDigits) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static long calculateSumOfDigits(long N) {
        long sum = 0;
        while (N != 0) {
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }

    private static boolean checkDistinctAdjacentDigits(long N) {
        String numString = Long.toString(N);
        for (int i = 0; i < numString.length()-1; i++) {
            if(numString.charAt(i) == numString.charAt(i+1) || Math.abs(numString.charAt(i) - numString.charAt(i+1)) != 2) {
                return false;
            }
        }
        return true;
    }
}
