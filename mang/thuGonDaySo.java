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
public class thuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                    arr[i] += arr[i + 1];
                    arr[i + 1] = 0;
                    n--;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                break;
            }
        }

        System.out.println(n);
    }
}
