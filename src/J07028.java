//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.TreeSet;
//import java.util.LinkedHashSet;
//
//class GiangVien {
//    private String id, name;
//    double gioDay;
//    public GiangVien(String id, String name) {
//        this.id = id;
//        this.name = name;
//        this.gioDay = 0;
//    }
//    public String getId() {
//        return this.id;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//    @Override
//    public String toString() {
//        return this.name + " " + String.format("%.2f", this.gioDay);
//    }
//}
//
//class Time {
//    private String id, id_Sub;
//    private Double teach_Time;
//    private GiangVien gv;
//    public Time(String id, String id_Sub, Double teach_Time, ArrayList<GiangVien> arr) {
//        this.id = id;
//        this.id_Sub = id_Sub;
//        this.teach_Time = teach_Time;
//        for(GiangVien x : arr) {
//            if(this.id.equals(x.getId())) {
//                this.gv = x;
//                x.gioDay += this.teach_Time;
//                break;
//            }
//        }
//    }
//}
//
//public class J07028 {
//    public static void main(String[] args) throws FileNotFoundException{
//        // Scanner sc = new Scanner(new File("MONHOC.in"));
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        while(n -- > 0) {
//            String s = sc.nextLine();
//        }
//
//        // sc = new Scanner(new File("GIANGVIEN.in"));
//
//        n = Integer.parseInt(sc.nextLine());
//        ArrayList <GiangVien> dsGV = new ArrayList<>();
//        while(n-- > 0) {
//            GiangVien gv = new GiangVien(sc.next(), sc.nextLine().substring(1));
//            dsGV.add(gv);
//        }
//        // sc = new Scanner(new File("GIOCHUAN.in"));
//        n = Integer.parseInt(sc.nextLine());
//        ArrayList <Time> arr = new ArrayList<>();
//
//        while(n-- > 0) {
//            String s = sc.nextLine();
//            String [] tmp = s.split("\\s+");
//            Time t = new Time(tmp[0], tmp[1], Double.parseDouble(tmp[2]), dsGV);
//            arr.add(t);
//        }
//        for(GiangVien x : dsGV) {
//            System.out.println(x);
//        }
//    }
//}