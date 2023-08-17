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
public class soDep1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testCases = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < testCases; i++) {
            String number = scanner.nextLine();

            String result = isBeautifulNumber(number) ? "YES" : "NO";
            System.out.println(result);
        }
    }

    private static boolean isBeautifulNumber(String number) {
        StringBuilder reverseNumber = new StringBuilder(number).reverse();
        if (!number.equals(reverseNumber.toString())) {
            return false;
        }
        
        if (!number.equals(reverseNumber.toString())) {
            return false;
        }
        
        for (char digit : number.toCharArray()) {
            int num = Character.getNumericValue(digit);
            if (num % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}
