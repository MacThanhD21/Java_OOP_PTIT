package src;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

class SinhVien {
    private String id, name;
    private String ns;
    private Float gpa;

    public SinhVien(String id, String name, String ns, Float gpa) {
        this.id = "B20DCCN0" + String.format("%02d", id);
        this.name = name;
        this.ns = ns;
        if (this.ns.charAt(1) == '/') {
            this.ns = "0" + this.ns;
        }
        if (this.ns.charAt(4) == '/') {
            this.ns = this.ns.substring(0, 3) + "0" + this.ns.substring(3);
        }
        this.gpa = gpa;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNs() {
        return this.ns;
    }

    public Float getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.ns + " " + String.format("%.2f", this.gpa);
    }
}

public class J07013 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));

        ArrayList<SinhVien> arr = (ArrayList<SinhVien>) ois.readObject();
        for (SinhVien sv : arr) {
            System.out.println(sv);
        }
    }
}
