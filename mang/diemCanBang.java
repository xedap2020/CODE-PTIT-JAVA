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
public class diemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int sum = 0;
            int index = -1;
            for (int j = 0; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    index = j;
                    break;
                }
            }

            if (index == -1) {
                System.out.println(-1);
            } else {
                System.out.println(index + 1);
            }
        }
    }
}
