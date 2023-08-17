/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.ptit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class hop2DaySo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        for (int num : a) {
            setA.add(num);
        }

        for (int num : b) {
            setB.add(num);
        }
        
        // Tìm hợp của A và B
        
        Set<Integer> union = new TreeSet<>(setA);
        union.addAll(setB);
        
        
        for (int num : union) {
            System.out.print(num + " ");
        }
        
    }
}
