/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.xaukitu;

import java.util.Scanner;

/**
 *
 * 
 * @author Admin
 */
public class soDep2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testCases = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < testCases; i++) {
            String number = scanner.nextLine();

            String result = isBeautifulNumber(number) ? "YES" : "NO";
            System.out.println(result);
        }
        
    }

    private static boolean isBeautifulNumber(String number) {
        // Kiểm tra xem số có thuận nghịch không
        StringBuilder reverseNumber = new StringBuilder(number).reverse();
        if (!number.equals(reverseNumber.toString())) {
            return false;
        }
        
        // Kiểm tra xem số bắt đầu và kết thúc bằng chữ số 8
        if (number.charAt(0) != '8' || number.charAt(number.length() - 1) != '8') {
            return false;
        }
        
        // Tính tổng các chữ số
        int sum = 0;
        for (char digit : number.toCharArray()) {
            int num = Character.getNumericValue(digit);
            sum += num;
        }
        
        // Kiểm tra xem tổng chữ số chia hết cho 10
        if (sum % 10 != 0) {
            return false;
        }
        
        return true;
    }
}
