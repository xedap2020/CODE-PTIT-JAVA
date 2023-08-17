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
public class tinhLuyThua {
    private static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            if(a == 0 && b == 0){
                break;
            }
            
            long result = powerModulo(a,b,MOD);
            
            System.out.println(result);
        }
        scanner.close();
    }

    private static long powerModulo(long a, long b, long m) {
        long result = 1;
        
        while(b>0){
            if(b%2==1){
                result = (result*a)% m;
            }
            a = (a*a)% m;
            b/=2;
        }
        
        return result;
    }
    
}
