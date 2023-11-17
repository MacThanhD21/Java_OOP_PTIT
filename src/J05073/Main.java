package src.J05073;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Shop> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            String s[] = sc.nextLine().split("\\s+");
            String id = s[0];
            double single_Price = Double.parseDouble(s[1]);
            double quantity = Double.parseDouble(s[2]);
            arr.add(new Shop(id, single_Price, quantity));
        }
        for(Shop x : arr) {
            System.out.println(x);
        }
    }
}
