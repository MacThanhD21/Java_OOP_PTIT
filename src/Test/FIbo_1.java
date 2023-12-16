import java.util.*;
import java.io.*;

public class FIbo_1 {
    static long[] fibo = new long[95];
    static List<Long> v = new ArrayList<>();
    static long n;
    static int res;
    static Set<List<Long>> se = new HashSet<>();

    public static void sang() {
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        for (int i = 2; i <= 92; i++) {
            if (n % fibo[i] == 0 && fibo[i] <= n) {
                v.add(fibo[i]);
            }
        }
    }

    public static void Try(int i, long p) {
        if (n == p) {
            ++res;
            return;
        }
        for (int j = i; j < v.size(); j++) {
            long value = v.get(j);
            if (value <= n / p) {
                p *= value;
                Try(j, p);
                p /= value;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            v.clear();
            res = 0;
            n = scanner.nextLong();
            sang();
            Try(0, 1);
            System.out.println(res);
        }
    }
}