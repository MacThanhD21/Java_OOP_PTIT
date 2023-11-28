import java.util.*;

public class J08011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> mp = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String num = sc.next();
            if(check(num)) {
                mp.put(num, mp.getOrDefault(num, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> sorted_List = new ArrayList<>(mp.entrySet());
        sorted_List.sort((entry1, entry2) -> {
            return entry2.getValue().compareTo(entry1.getValue());
        });
        sorted_List.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
    public static boolean check(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
