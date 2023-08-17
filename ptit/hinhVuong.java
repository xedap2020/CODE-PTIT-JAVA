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
public class hinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        
        // Tìm điểm trái dưới và phải trên của hình vuông
        int left = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int bottom = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int right = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int top = Math.max(Math.max(y1, y2), Math.max(y3, y4));
        
        // Tính diện tích hình vuông
        
        int side = Math.max(right - left, top - bottom);
        int area = side * side;
        
        
        System.out.println(area);

        scanner.close();
    }
}
