import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class A {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger x = new BigInteger("2");
        BigInteger mod_1 = a.add(b).mod(new BigInteger("2"));
        BigInteger mod_2 = a.subtract(b).mod(new BigInteger("2"));
        if (!mod_1.equals(BigInteger.ZERO) || !(mod_2.equals(BigInteger.ZERO))) {
            System.out.println("NOT FOUND");
        }
        else {
            System.out.printf(a.add(b).divide(x) + " " + a.subtract(b).divide(x));
        }
    }
}