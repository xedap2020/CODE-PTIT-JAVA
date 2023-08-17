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
public class khaiBaoLopSinhVien {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.nhapThongTin();
        sinhVien.inThongTin();
    }

    private static class SinhVien {
        private String maSV;
        private String hoTen;
        private String lop;
        private String ngaySinh;
        private float diemGPA;
        public SinhVien() {
            this.maSV = "B20DCCN001";
            this.hoTen = "";
            this.lop = "";
            this.ngaySinh = "";
            this.diemGPA = 0.0f;
        }

        private void nhapThongTin() {
            Scanner scanner = new Scanner(System.in);
            this.hoTen = scanner.nextLine();
            this.lop = scanner.nextLine();
            this.ngaySinh = scanner.nextLine();
            this.diemGPA = scanner.nextFloat();
        }

        private void inThongTin() {
            System.out.print(this.maSV+" ");
            System.out.print(this.hoTen+" ");
            System.out.print(this.lop+" ");
            System.out.print(this.chuanHoaNgaySinh(this.ngaySinh)+" ");
            System.out.println(String.format("%.2f", this.diemGPA));
        }

        private String chuanHoaNgaySinh(String ngaySinh) {
            String[] parts = ngaySinh.split("/");
            if(parts.length == 3) {
                String ngay = parts[0].trim();
                String thang = parts[1].trim();
                String nam = parts[2].trim();
                return String.format("%02d/%02d/%s", Integer.parseInt(ngay), Integer.parseInt(thang), nam);
            }
            return ngaySinh;
        }
    }
}
