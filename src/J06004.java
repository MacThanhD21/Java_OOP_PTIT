package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements  Comparable<Student>{
    String id, name, phone, order_Gr_number;
    String name_BTL = "";
    public Student(String id, String name, String phone, String order_Gr_number) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.order_Gr_number = order_Gr_number;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + order_Gr_number + " " + name_BTL;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
public class J06004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> arr = new ArrayList<>();

        while(n-- > 0) {
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i = 1; i <= m; i++) {
            String name_BTL = sc.nextLine();
            for(Student x : arr) {
                if(x.order_Gr_number.equals(i + "")) {
                    x.name_BTL = name_BTL;
                }
            }
        }
        Collections.sort(arr);
        for(Student x : arr) {
            System.out.println(x);
        }
    }
}
