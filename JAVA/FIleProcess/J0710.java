/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FIleProcess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J0710 {
    public static int stt = 1;
    private static class SinhVien {
        private String id,name,clas,birthday;
        private double gpa;
        
        public SinhVien(Scanner sc) {
            this.id = getId(stt++);
            this.name = sc.nextLine();
            this.clas = sc.next();
            this.birthday = standardDay(sc.next());
            this.gpa = sc.nextDouble();
        }
        
        public static String getId(int n){
            String s = String.valueOf(n);
            while(s.length()<3) s = '0'+s;
            return "B20DCCN" + s;
        }
        public static String standardDay(String s){
            String []data = s.split("/");
            if(data[0].length()==1) data[0] = '0' + data[0];
            if(data[1].length()==1) data[1] = '0' + data[1];
            return data[0]+'/'+data[1]+'/'+data[2];
        }
        
        @Override
        public String toString(){
            return this.id+' '+this.name+' '+this.clas
                    +' '+this.birthday+' '+String.format("%.2f",this.gpa);
        }
    }
    public static void main(String []args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            ds.add(new SinhVien(sc));
        }
        for(SinhVien i : ds) System.out.println(i);
    }  
}
