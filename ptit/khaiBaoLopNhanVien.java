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
public class khaiBaoLopNhanVien {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhapThongTin();
        nhanVien.inThongTin();
    }

    private static class NhanVien {
        private String maNV;
        private String hoTen;
        private String gioiTinh;
        private String ngaySinh;
        private String diaChi;
        private String maSoThue;
        private String ngayKyHopDong;
        public NhanVien() {
            this.maNV = "00001";
            this.hoTen = "";
            this.gioiTinh = "";
            this.ngaySinh = "";
            this.diaChi = "";
            this.maSoThue = "";
            this.ngayKyHopDong = "";
        }

        private void nhapThongTin() {
            Scanner scanner = new Scanner(System.in);
            this.hoTen = scanner.nextLine();
            this.gioiTinh = scanner.nextLine();
            this.ngaySinh = scanner.nextLine();
            this.diaChi = scanner.nextLine();
            this.maSoThue = scanner.nextLine();
            this.ngayKyHopDong = scanner.nextLine();
        }

        private void inThongTin() {
            System.out.print(this.maNV+ " ");
            System.out.print(this.hoTen+" ");
            System.out.print(this.gioiTinh+" ");
            System.out.print(this.ngaySinh+" ");
            System.out.print(this.diaChi + " ");
            System.out.print(this.maSoThue+ " ");
            System.out.print(this.ngayKyHopDong);
        }
    }
}
