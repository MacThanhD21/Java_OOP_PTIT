import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 1. stack
        // Stack<Integer> Stack = new Stack<>();
        // Stack.add(2);
        // Stack.add(3);
        // Stack.add(4);
        // Stack.add(5);
        // System.out.println("Stack: " + Stack); // [2, 3, 4, 5]

        // // Thêm toàn bộ phần tử của 1 list khác vào list hiện tại.
        // Stack.addAll(Stack);
        // // Lấy từ đỉnh stack
        // // 1. pop : remove and return
        // // 2. peek: only return
        // // 3. remove
        // System.out.println(Stack.capacity());
        // System.out.println(Stack.peek());

        // Stack.remove(2); // remove element at index position

        // // while(!Stack.empty()) {
        // // System.out.println(Stack.peek());
        // // }
        // for(Integer x : Stack) {
        // System.out.print(x + " ");
        // }
        // System.out.println();
        // // 2. Queue
        // Queue<Integer> qu = new LinkedList<>();
        // qu.add(2);
        // qu.add(1);
        // qu.add(3);
        // qu.add(5);
        // qu.add(4);
        // // System.out.println(qu.poll());
        // // while(!qu.isEmpty()) {
        // // System.out.println(qu.poll());
        // // }

        // // qu.clear(); // xoa queue
        // // while(!qu.isEmpty()) {
        // // System.out.println(qu.poll());
        // // }

        // // Kieemr tra ton tai
        // System.out.println(qu.containsAll(Stack));
        // // qu.contains(3);
        // //
        // System.out.println(qu.element()); // khác peek là nếu phần tử không có trong
        // queue or queue rỗng thì sẽ đáp exception

        // // 3. Deque
        // Deque<Integer> deque = new LinkedList<>();
        // deque.add(2);
        // deque.add(1);
        // deque.add(3);
        // deque.add(5);
        // deque.add(4);
        // deque.addFirst(0);
        // deque.addLast(6);
        // System.out.println(deque);

        // // 4. Set, Map

        // Set<String> set = new HashSet<>();
        // set.add("A");
        // set.add("B");

        // Map<String, Integer> map = new HashMap<>();
        // map.put("A", 1);
        // map.put("B", 2);
        // map.put("C", 3);
        // // Thay doi gia tri cua key A
        // map.replace("A", 9);

        // for(String x : map.keySet()) {
        // System.out.println(x + " " + map.get(x));
        // }

        // System.out.println(map);

        // 5. List

        // 6. String

        String s[] = "MAC VAN THANH".split("\\s+");
        String res = "";
        for (String x : s) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }
        System.out.println(res.trim());

        // StringTokenizer
        String tmp = "java python C++ php";
        StringTokenizer st = new StringTokenizer(tmp);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + " ");
        }
        System.out.println();
        // 7. BigInteger
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        System.out.println(a.divide(new BigInteger("100")));
        System.out.println(b);

        // 8. Xử lý Date
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = format.parse("14/08/2018");
            Date date2 = format.parse("20/08/2018");
            long diffInMillies = Math.abs(date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24);
            System.out.println(diffInMillies);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 9. ArrayList

        // ObjectInputStream obj = new ObjectInputStream(new FileInputStream("main.txt"));

        // ArrayList <Integer> arr = obj.readObject();
    }
}
