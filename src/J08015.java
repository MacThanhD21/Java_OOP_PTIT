import java.util.*;
public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long ans = 0;
            HashMap<Long, Integer> mp = new HashMap<>();
            for(int i = 0; i < n; i++) {
                long x = k - a[i];

                if(mp.containsKey(x)) {
                    ans += mp.get(x);
                }
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }
            System.out.println(ans);
        }
    }
}