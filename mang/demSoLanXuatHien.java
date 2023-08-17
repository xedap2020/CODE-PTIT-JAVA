/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.mang;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class demSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numTests = scanner.nextInt();
        
        for (int t = 1; t <= numTests; t++) {
            System.out.println("Test " + t + ":");
            int n = scanner.nextInt();
            
            int[] arr = new int[n];
            for(int i=0; i<n;i++){
                arr[i] = scanner.nextInt();
            }
            
            // Đếm số lần xuất hiện của mỗi số trong dãy
            
            Map<Integer, Integer> countMap = countOccurrences(arr);
            
            // In kết quả
            for (int i = 0; i < n; i++) {
                int number = arr[i];
                if (countMap.containsKey(number)) {
                    System.out.println(number + " xuat hien " + countMap.get(number) + " lan");
                    countMap.remove(number);
                }
            }
        }
        scanner.close();
    }

    private static Map<Integer, Integer> countOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for(int num: arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap;
    }
}
