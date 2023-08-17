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
public class bienDoiAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int countA = 0; // Số lần biến đổi dãy 'A' liên tiếp
        int countB = 0; // Số lần biến đổi dãy 'B' liên tiếp

        char prevChar = s.charAt(0);
        if (prevChar == 'A') {
            countB++;
        } else {
            countA++;
        }

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != prevChar) {
                if (currentChar == 'A') {
                    countB++;
                } else {
                    countA++;
                }
            }
            prevChar = currentChar;
        }

        int minSteps = Math.min(countA, countB) + 1;
        System.out.println(minSteps);
    }
}
