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
public class boiSoChungUocSoChung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long gcd = findGCD(a, b);
            long lcm = findLCM(a, b, gcd);

            System.out.print(lcm + " ");
            System.out.println(gcd + " ");
        }
    }

    private static long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    private static long findLCM(long a, long b, long gcd) {
        return (a * b) / gcd;
    }
}
