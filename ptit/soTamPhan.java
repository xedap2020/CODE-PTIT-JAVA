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
public class soTamPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int number = scanner.nextInt();
            String strNumber = Integer.toString(number);
            boolean isTamPhan = true;
           
            for (char ch : strNumber.toCharArray()) {
                // Kiểm tra ký tự có thuộc tập {0, 1, 2} hay không
                if (ch != '0' && ch != '1' && ch != '2') {
                    isTamPhan = false;
                    break;
                }
            }
            
            if (isTamPhan) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
