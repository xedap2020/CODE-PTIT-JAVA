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
public class tongGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        System.out.print(sum);
    }
}
