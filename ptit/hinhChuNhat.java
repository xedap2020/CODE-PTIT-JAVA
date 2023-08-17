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
public class hinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int perimeter = 0;
        int area = 0;
        if (length > 0 && width > 0) {
            perimeter = 2 * (length + width);
            area = length * width;
        }
        System.out.print(perimeter + " ");
        System.out.println(area);
    }
}
