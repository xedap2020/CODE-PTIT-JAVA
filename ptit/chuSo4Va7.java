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
public class chuSo4Va7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        long N = scanner.nextLong();

        // Chuyển đổi số nguyên thành chuỗi
        String strN = Long.toString(N);

        int count4 = 0;
        int count7 = 0;

        // Đếm số lần xuất hiện của chữ số 4 và chữ số 7 trong chuỗi
        for (int i = 0; i < strN.length(); i++) {
            char digit = strN.charAt(i);
            if (digit == '4') {
                count4++;
            } else if (digit == '7') {
                count7++;
            }
        }
        
        int count = count4 + count7;
        // Kiểm tra kết quả đếm được
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
    
}
