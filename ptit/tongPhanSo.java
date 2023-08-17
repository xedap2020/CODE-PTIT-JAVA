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
public class tongPhanSo {

    public static void main(String[] args) {
        PhanSo p = new PhanSo();
        PhanSo q = new PhanSo();
        p.nhapPhanSo();
        q.nhapPhanSo();
        p.congPhanSo(q);
        p.rutGonPhanSo();
        p.inPhanSo();
    }

    private static class PhanSo {

        private int tuSo;
        private int mauSo;

        public PhanSo() {
            this.tuSo = 0;
            this.mauSo = 1;
        }

        private void nhapPhanSo() {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("\\s+");

            this.tuSo = lineScanner.nextInt();
            this.mauSo = lineScanner.nextInt();

            lineScanner.close();
        }

        private void congPhanSo(PhanSo phanSo) {
            int tuSoMoi = this.tuSo * phanSo.mauSo + phanSo.tuSo * this.mauSo;
            int mauSoMoi = this.mauSo * phanSo.mauSo;

            this.tuSo = tuSoMoi;
            this.mauSo = mauSoMoi;
        }

        private void rutGonPhanSo() {
            int ucln = timUocChungLonNhat(this.tuSo, this.mauSo);
            this.tuSo /= ucln;
            this.mauSo /= ucln;
        }

        private int timUocChungLonNhat(int a, int b) {
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
