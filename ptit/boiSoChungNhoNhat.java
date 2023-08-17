/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.ptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class boiSoChungNhoNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            

            String strNum1 = scanner.nextLine();
            String strNum2 = scanner.nextLine();

            BigInteger num1 = new BigInteger(strNum1);
            BigInteger num2 = new BigInteger(strNum2);
            
            // Tìm LCM
            BigInteger lcm = findLCM(num1, num2);
            
            System.out.println(lcm.toString());
            
        }
        scanner.close();
    }

    private static BigInteger findLCM(BigInteger num1, BigInteger num2) {
        BigInteger gcd = num1.gcd(num2);
        BigInteger product = num1.multiply(num2);
        BigInteger lcm = product.divide(gcd);
        return lcm;
    }
}
