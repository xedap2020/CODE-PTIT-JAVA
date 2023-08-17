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
public class soLienKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            long number = scanner.nextLong();
            String strNumber = Long.toString(number);
            
            boolean isTinhChat = true;
            0
            for (int j = 0; j < strNumber.length() - 1; j++) {
                char currentChar = strNumber.charAt(j);
                char nextChar = strNumber.charAt(j + 1);
                
                // Kiểm tra xem ký tự hiện tại có giống ký tự tiếp theo hay không
                if (currentChar == nextChar) {
                    isTinhChat = false;
                    break;
                }
                
                // Kiểm tra xem giá trị tuyệt đối của hiệu giữa ký tự hiện tại và ký tự tiếp theo có khác 1 hay không
                if (Math.abs(currentChar - nextChar) != 1) {
                    isTinhChat = false;
                    break;
                }
                
                
            }
            
            if (isTinhChat) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
