package src.J05073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Shop> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            String id = sc.nextLine();
            double single_Price = Double.parseDouble(sc.nextLine());
            double quantity = Double.parseDouble(sc.nextLine());
            arr.add(new Shop(id, single_Price, quantity));
        }
        for(Shop x : arr) {
            System.out.println(x);
        }
    }
}
