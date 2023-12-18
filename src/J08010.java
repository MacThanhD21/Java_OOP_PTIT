
import java.util.*;

public class J08010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> hm = new LinkedHashMap();

        int max_len = 0;
        while(sc.hasNext()) {
            String s = sc.next();
            if(s.equals(new StringBuilder(s).reverse().toString())) {
                if(s.length() > max_len) {
                    max_len = s.length();
                    hm.clear();
                    hm.put(s, 1);

                } else if(s.length() == max_len) {
                    if(!hm.containsKey(s)) {
                        hm.put(s, 1);
                    } else {
                        hm.put(s, hm.get(s) + 1);
                    }
                }
            }
        }
        for(String s : hm.keySet()) {
            System.out.println(s + " " + hm.get(s));
        }
    }
}
