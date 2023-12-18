import java.util.*;
import java.io.*;

public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream(new File("NHIPHAN.in")));
        ArrayList<String> ar = (ArrayList<String>) ip.readObject();
        HashSet<String> hs = new HashSet<>(ar);

        for(String s : ar) {
            String[] res = s.split("\\s+");
            for(String x : res) {
                hs.add(x.toLowerCase());
            }
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        HashSet<String> hs_2 = new HashSet<>(ar);

        while(sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if(hs.contains(s) && !hs_2.contains(s)) {
                System.out.println(s);
                hs_2.add(s);
            }
        }
    }
}