
import java.util.*;

public class Aplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int coun = 0;
        for(int i = 0; i < n * 3; i++) {
            String s = sc.nextLine();
            coun++;
            if (coun==3) {
                coun = 0;
                if(map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                }
                else {
                    map.put(s, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> New_map = new LinkedList<>(map.entrySet());
        Collections.sort(New_map, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : New_map) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        for(String x : sortedMap.keySet()) {
            System.out.println(x);
        }
    }
}
