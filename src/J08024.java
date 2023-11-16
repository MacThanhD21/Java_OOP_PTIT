import java.util.*;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Long> queue = new LinkedList<>();
        queue.add(9L);
        List<Long> list = new ArrayList<>();
        long[] res = new long[201];
        while (true) {
            long u = queue.poll();
            list.add(u);
            if (u >= 1e18)
                break;
            queue.add(u * 10);
            queue.add(u * 10 + 9);
        }
        for (int i = 1; i <= 200; i++) {
            for (long it : list) {
                if (it % i == 0) {
                    res[i] = it;
                    break;
                }
            }
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            System.out.println(res[n]);
        }
    }
}