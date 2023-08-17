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
public class tongSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau T

        while (T-- > 0) {
            String X = scanner.nextLine();
            String Y = scanner.nextLine();

            String result = addStrings(X, Y);
            System.out.println(result);
        }
    }

    public static String addStrings(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = X.length() - 1;
        int j = Y.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digitX = (i >= 0) ? X.charAt(i--) - '0' : 0;
            int digitY = (j >= 0) ? Y.charAt(j--) - '0' : 0;

            int sum = digitX + digitY + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }

        return sb.reverse().toString();
    }
}
