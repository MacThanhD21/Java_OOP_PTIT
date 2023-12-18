
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;

        while (sc.hasNext()) {
            String s = sc.next();
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(sum);
    }
}