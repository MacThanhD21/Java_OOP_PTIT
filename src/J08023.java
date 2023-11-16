import java.util.Scanner;
import java.util.Stack;

public class J08023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            long ans = 0;
            for(int i = 0; i < n; i++) {
                while(!st.empty() && a[i] < a[st.peek()]) {
                    int x = st.pop();
                    if(st.empty()) {
                        ans = Math.max(ans, 1L * i * a[x]);
                    }
                    else {
                        ans = Math.max(ans, 1L * (i - st.peek() - 1) * a[x]);
                    }
                }
                st.push(i);
            }
            while(st.size() != 0) {
                int x = st.pop();
                if(st.empty()) {
                    ans = Math.max(ans,1L *  n * a[x]);
                }
                else {
                    ans = Math.max(ans, 1L * (n - st.peek() - 1) * a[x]);
                }
            }
            System.out.println(ans);
        }
    }
}