package OOP;


import java.util.ArrayList;
import java.util.Scanner;

class sinhVien {
    private String maSV, hoTen, lop, ngaySinh;
    private double gpa;

    public sinhVien() {
    }

    public sinhVien(String maSV, String hoTen, String lop, String ngaySinh, double gpa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public void chuanHoaNS() {
        StringBuilder sb = new StringBuilder(ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        ngaySinh = sb.toString();
    }

    public void chuanHoaTen() {
        String res = "";
        String[] s = this.hoTen.trim().split("\\s+");
        for (String x : s) {
            res += Character.toUpperCase(x.charAt(0));
            for (int j = 1; j < x.length(); j++) {
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        hoTen = res.trim();
    }

    public String toString() {
        chuanHoaTen();
        chuanHoaNS();
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}

public class J05004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien> sv = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv.add(new sinhVien("B20DCCN" + String.format("%03d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        for (sinhVien x : sv) {
            System.out.println(x);
        }
    }
}



