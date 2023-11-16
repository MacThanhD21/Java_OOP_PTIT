package src.J07034;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Subject> arr = new ArrayList<>();
        while(n-- > 0) {
            arr.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(Subject x : arr) {
            System.out.println(x);
        }
        sc.close();
    }
}
