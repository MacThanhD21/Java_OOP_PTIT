package src.J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Business> arr = new ArrayList<>();
        while(n-- > 0) {
            arr.add(new Business(sc.nextLine(), sc.nextLine(), sc.nextLine()));   
        }
        Collections.sort(arr);
        for(Business x : arr) {
            System.out.println(x);
        }
    }
}
