import java.io.*;
import java.util.*;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> ar = new ArrayList<>();
        while(sc.hasNext()) {
            String s = sc.next();
            try {
                int a = Integer.parseInt(s);
            } catch (Exception e)
            {
                ar.add(s);
            }
        }
        Collections.sort(ar);
        for(String a : ar) {
            System.out.print(a + " ");
        }
    }
}