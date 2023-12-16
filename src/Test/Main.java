import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<HashMap<Character, Integer>> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int pos_1 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                HashMap<Character, Integer> tempMap = new HashMap<>();
                tempMap.put(s.charAt(i), i + 1);
                stack.push(tempMap);
            }
            else if(s.charAt(i) == ')') {
                if(!stack.isEmpty()) {
                    HashMap<Character, Integer> c = stack.pop();
                    for (Character key : c.keySet()) {
                        map.put(c.get(key), i + 1);
                    }
                }
            }
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        for(Integer x : sortedMap.keySet()) {
            System.out.println(x + " " + map.get(x));
        }
    }
}
