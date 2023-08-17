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
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[n - 1];
        boolean allPresent = true;
        for (int i = 1; i <= max; i++) {
            if (!contains(arr, i)) {
                System.out.println(i);
                allPresent = false;
                
            }
        }
        if(allPresent){
            System.out.println("Excellent!");
        }
        
    }

    private static boolean contains(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
}
