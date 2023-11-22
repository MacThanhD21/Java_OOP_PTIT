package src.J05071;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Province> dsProvince = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            dsProvince.add(new Province(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        ArrayList<Phone> dsCall = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            String s[] = sc.nextLine().split("\\s+");
            dsCall.add(new Phone(s[0], s[1], s[2], dsProvince));
        }
        for(Phone x : dsCall) {
            System.out.println(x);
        }
    }
}
