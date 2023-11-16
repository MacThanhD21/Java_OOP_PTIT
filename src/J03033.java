// package src;

import java.util.Scanner;
import java.math.BigInteger;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = a.divide(gcd).multiply(b);
            System.out.println(lcm);
        }
        sc.close();
    }
}


