/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.xaukitu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class chiahetcho11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau T

        while (T-- > 0) {
            String N = scanner.nextLine();
            int result = isDivisibleByEleven(N);
            System.out.println(result);
        }
    }

    static int isDivisibleByEleven(String N) {
        int evenSum = 0;
        int oddSum = 0;
        boolean isEven = true;

        for (int i = N.length() - 1; i >= 0; i--) {
            int digit = N.charAt(i) - '0';
            if (isEven) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            isEven = !isEven;
        }

        int difference = Math.abs(evenSum - oddSum);
        return (difference % 11 == 0) ? 1 : 0;
    }
}
