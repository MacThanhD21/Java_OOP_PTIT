import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class thiSinh implements Comparable<thiSinh> {
    private String ma, ten, danToc, KV;
    private float diem;
    private static int cnt = 1;

    public thiSinh(String ten, float diem, String danToc, String KV) {
        this.ma = "TS" + String.format("%02d", cnt++);
        this.ten = ten;
        this.danToc = danToc;
        this.KV = KV;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public String chuanhoa() {
        String[] tenCH = this.ten.trim().split("\\s+");
        String tmp = "";
        for (int i = 0; i < tenCH.length; i++) {
            tenCH[i] = tenCH[i].substring(0, 1).toUpperCase() +
                    tenCH[i].substring(1).toLowerCase();
            tmp += tenCH[i] + " ";
        }
        return tmp.trim();
    }

    public float Uutien() {
        if(this.danToc.equals("Kinh")) {
            if(this.KV.equals("1")) {
                return 1.5f;
            }
            else if(this.KV.equals("2")) {
                return 1.0f;
            }
            else {
                return 0.0f;
            }
        }
        else {
            if(this.KV.equals("1")) {
                return 3.0f;
            }
            else if(this.KV.equals("2")) {
                return 2.5f;
            }
            else {
                return 1.5f;
            }
        }
    }

    public float tongDiem() {
        return this.diem + Uutien();
    }

    public String trangThai() {
        if (this.tongDiem() >= 20.5)
            return "Do";
        else
            return "Truot";
    }

    @Override
    public String toString() {
        return ma + " " + chuanhoa() + " " + String.format("%.1f", this.tongDiem()) + " " + trangThai();
    }

    @Override
    public int compareTo(thiSinh o) {
        if (this.tongDiem() == o.tongDiem())
            return this.ma.compareTo(o.ma);
        if (this.tongDiem() < o.tongDiem())
            return 1;
        else
            return -1;
    }
}

public class J07057 {

    public static void main(String[] args) throws FileNotFoundException {
        // Scanner sc = new Scanner(new File("THISINH.in"));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<thiSinh> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            thiSinh ts = new thiSinh(sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), sc.nextLine());
            list.add(ts);
        }
        Collections.sort(list);
        for (thiSinh i : list) {
            System.out.println(i);
        }
    }
}