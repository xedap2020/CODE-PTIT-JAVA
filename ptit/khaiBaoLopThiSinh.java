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
public class khaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoTen = scanner.nextLine();
        String ngaySinh = scanner.nextLine();
        float diemMon1 = scanner.nextFloat();
        float diemMon2 = scanner.nextFloat();
        float diemMon3 = scanner.nextFloat();
        float tongDiem = diemMon1 + diemMon2 + diemMon3;
        System.out.print(hoTen+" ");
        System.out.print(ngaySinh+" ");
        System.out.println(String.format("%.1f", tongDiem));
    }
}
