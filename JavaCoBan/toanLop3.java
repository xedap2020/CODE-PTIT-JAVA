/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.JavaCoBan;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class toanLop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau T

        while (T-- > 0) {
            String expression = scanner.nextLine();
            boolean found = false;

            // Duyệt qua các giá trị từ 0 đến 99 cho số đầu tiên
            for (int a = 0; a < 100; a++) {
                // Duyệt qua các giá trị từ 0 đến 99 cho số thứ hai
                for (int b = 0; b < 100; b++) {
                    String replacedExpression = expression.replace("?0", Integer.toString(a));
                    replacedExpression = replacedExpression.replace("?1", Integer.toString(b));

                    // Kiểm tra xem biểu thức có đúng hay không
                    if (isValidExpression(replacedExpression)) {
                        System.out.println(replacedExpression);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (!found) {
                System.out.println("WRONG PROBLEM!");
            }
        }
    }

    static boolean isValidExpression(String expression) {
        String[] parts = expression.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        int result = Integer.parseInt(parts[4]);

        if (parts[1].equals("+")) {
            return a + b == result;
        } else if (parts[1].equals("-")) {
            return a - b == result;
        } else if (parts[1].equals("*")) {
            return a * b == result;
        } else if (parts[1].equals("/")) {
            return b != 0 && a % b == 0 && a / b == result;
        }

        return false;
    }
}
