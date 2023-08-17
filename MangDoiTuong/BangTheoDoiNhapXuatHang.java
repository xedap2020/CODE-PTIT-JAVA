package MangDoiTuong;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Houta
 */
public class BangTheoDoiNhapXuatHang {
    private static class MaHang{
        private String id;
        private long slNhap,slXuat,donGia,tien,thue;
        
        MaHang(Scanner sc){
            this.id = sc.next();
            this.slNhap = sc.nextLong();
            if(this.id.startsWith("A")) this.slXuat = Math.round(this.slNhap*6/10.0);
            if(this.id.startsWith("B")) this.slXuat = Math.round(this.slNhap*7/10.0);
            
            if(this.id.endsWith("Y")) this.donGia = 110000;
            if(this.id.endsWith("N")) this.donGia = 135000;
            this.tien = this.slXuat*this.donGia;
            if(this.id.startsWith("A")&&this.id.endsWith("Y")) this.thue = this.tien*8/100;
            if(this.id.startsWith("A")&&this.id.endsWith("N")) this.thue = this.tien*11/100;
            if(this.id.startsWith("B")&&this.id.endsWith("Y")) this.thue = this.tien*17/100;
            if(this.id.startsWith("B")&&this.id.endsWith("N")) this.thue = this.tien*22/100;
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MaHang> ds = new ArrayList<>();
        while(t-->0){
            ds.add(new MaHang(sc));
        }
        for(MaHang tmp : ds)
            System.out.printf("%s %d %d %d %d %d\n",tmp.id,tmp.slNhap,tmp.slXuat,tmp.donGia,tmp.tien,tmp.thue);
    }
}
