
import java.util.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++) {
                while(!st.isEmpty() && a[st.peek()] < a[i]) {
                    a[st.pop()] = a[i];
                }
                st.push(i);
            }
            while(!st.isEmpty()) {
                a[st.pop()] = -1;
            }
            for(Integer x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
