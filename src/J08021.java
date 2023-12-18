import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int ans = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    st.push(i);
                } else {
                    st.pop();
                    if (!st.isEmpty()) {
                        ans = Math.max(ans, i - st.peek());
                    } else {
                        st.push(i);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
