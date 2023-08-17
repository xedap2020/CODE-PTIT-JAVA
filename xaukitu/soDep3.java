/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.xaukitu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class soDep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        scanner.nextLine(); // Đọc kí tự xuống dòng sau số lượng test cases

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
        
        // Kiểm tra xem số có chỉ toàn các chữ số nguyên tố không
        for (char digit : number.toCharArray()) {
            int num = Character.getNumericValue(digit);
            if (!isPrime(num)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
