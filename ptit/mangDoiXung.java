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
public class mangDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = scanner.nextInt();
            }
            // kiem tra tinh doi xung cua day
            boolean isSymmetric = checkSymmetry(arr);
            //in ket qua tim kiem
            if (isSymmetric) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean checkSymmetry(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }       
}
