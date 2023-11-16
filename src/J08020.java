
import java.util.*;

public class J08020 {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.add(c);
            }
            else {
                // Gap dau: ), ], } o dau chuoi
                if(stack.isEmpty()) {
                    return false;
                }
                else {
                    char top = stack.peek();
                    if(c == ')' && top == '(') {
                        stack.pop();
                    }
                    else if(c == ']' && top == '[') {
                        stack.pop();
                    }
                    else if(c == '}' && top == '{') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String s = sc.nextLine();
            if(check(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
