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
public class giaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN"); // Phương trình có vô số nghiệm
            } else {
                System.out.println("VN"); // Phương trình vô nghiệm
            }
        } else {
            double x = -b / a;
            System.out.printf("%.2f\n", x); // Phương trình có nghiệm duy nhất
        }
        
        scanner.close();
    }
}
