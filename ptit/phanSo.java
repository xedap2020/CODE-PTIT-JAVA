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
public class phanSo {
    public static void main(String[] args) {
        PhanSo phanSo = new PhanSo();
        phanSo.nhapPhanSo();
        phanSo.toiGianPhanSo();
        phanSo.inPhanSo();
    }

    private static class PhanSo {
        private long tuSo;
        private long mauSo;
        public PhanSo() {
            this.tuSo = 0;
            this.mauSo = 1;
        }

        private void nhapPhanSo() {
            Scanner scanner = new Scanner(System.in);
            this.tuSo = scanner.nextLong();
            this.mauSo = scanner.nextLong();

        }

        private void toiGianPhanSo() {
            long ucln = timUocChungLonNhat(this.tuSo, this.mauSo);
            this.tuSo /= ucln;
            this.mauSo /= ucln;
        }

        private long timUocChungLonNhat(long a, long b) {
            if (b == 0) {
            return a;
        }
        return timUocChungLonNhat(b, a % b);
        }

        private void inPhanSo() {
            System.out.println(this.tuSo + "/" + this.mauSo);
        }
    }
}
