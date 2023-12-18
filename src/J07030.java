import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class J07030 {
    public static boolean check(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream ois_1 = new ObjectInputStream(new FileInputStream("DATA1.in"));

        ObjectInputStream ois_2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> ar1 = (ArrayList<Integer>) ois_1.readObject();
        ArrayList<Integer> ar2 = (ArrayList<Integer>) ois_2.readObject();

        HashSet<Integer> se_1 = new HashSet<>(ar1);
        HashSet<Integer> se_2 = new HashSet<>(ar2);
        
        for(int i = 2; i < 1000000 / 2 + 1; i++) {
            if(check(i) && check(1000000 - i) && se_1.contains(i) && se_2.contains(1000000 - i)) {
                System.out.println(i + " " + (1000000 - i));
            }
        }
    }
}