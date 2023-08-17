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
public class uocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            
            int N = scanner.nextInt();

            // Đếm số ước số chia hết cho 2
            int count = countEvenDivisors(N);

            // In kết quả
            System.out.println(count);
        }
        scanner.close();
    }

    private static int countEvenDivisors(int N) {
        int count = 0;
        
        for (int i = 1; i <= N; i++) {
            if(N%i == 0 && i % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
