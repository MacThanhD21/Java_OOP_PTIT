
import java.util.*;
import java.io.*;

class SinhVien {
    private String id, name, clas, ns, gpa;
    public SinhVien(int id, String name, String clas, String ns, String gpa) {
        this.id = "B20DCCN0" + String.format("%02d", id);
        this.ns = ns;
        this.clas = clas;
        this.name = name;
        if(this.ns.charAt(1) == '/') {
            this.ns = "0" + this.ns;
        }
        if(this.ns.charAt(4) == '/') {
            this.ns = this.ns.substring(0, 3) + "0" + this.ns.substring(3);
        }
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.clas + " " + this.ns + " " + String.format("%.2f", Double.parseDouble(this.gpa));
    }
}
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException{
        // Scanner sc = new Scanner(new File("SV.in"));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ar = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ar.add(new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(SinhVien x : ar) {
            System.out.println(x);
        }
    }
}
