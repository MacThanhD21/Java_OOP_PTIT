package src.J07047;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        // Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList <Hotel> dsHotel = new ArrayList<>();
        while(n-- > 0) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            dsHotel.add(new Hotel(tmp[0], tmp[1], Integer.parseInt(tmp[2]), Double.parseDouble(tmp[3])));
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList <Client> arr2 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr2.add(new Client(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), dsHotel));
        }
        Collections.sort(arr2);
        for(Client tmp : arr2) {
            System.out.println(tmp);
        }
        sc.close();
    }
}
