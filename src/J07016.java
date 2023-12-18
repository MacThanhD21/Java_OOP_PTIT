package src;
import java.io.*;
import java.util.*;

public class J07016 {
    public static boolean check(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois_1 = new ObjectInputStream(new FileInputStream(new File("DATA1.in")));
        ObjectInputStream ois_2 = new ObjectInputStream(new FileInputStream(new File("DATA2.in")));

        ArrayList<Integer> ar1 = (ArrayList<Integer>) ois_1.readObject();
        ArrayList<Integer> ar2 = (ArrayList<Integer>) ois_2.readObject();

        int[] fre_1 = new int[ar1.size()];
        int[] fre_2 = new int[ar2.size()];
        for(int x : ar1) {
            if(check(x)) {
                fre_1[x]++;
            }
        }
        for(int x : ar2) {
            if(check(x)) {
                fre_2[x]++;
            }
        }
        for(int i = 2; i < 100000; i++) {
            if(fre_1[i] > 0 && fre_2[i] > 0) {
                System.out.println(i + " " + fre_1[i] + " " + fre_2[i]);
            }
        }
    }
}
