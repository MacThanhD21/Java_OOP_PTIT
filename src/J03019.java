import java.util.*;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String s = sc.nextLine();

        for (int i = 0;i<s.length();i++) {
            while (!st.empty() && s.charAt(i) > st.peek()) {
                st.pop();
            }
            st.push(s.charAt(i));
        }

        String res = "";
        while (!st.empty()) {
            res = st.pop() + res;
        }

        System.out.println(res);
    }
}
