
import java.util.*;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st_1 = new Stack<>();
        Stack<Character> st_2 = new Stack<>();

        for(char x : s.toCharArray()) {
            if(x == '<') {
                if(!st_1.isEmpty()) {
                    st_2.push(st_1.pop());
                }
            } else if(x == '>') {
                if(!st_2.isEmpty()) {
                    st_1.push(st_2.pop());
                }
            } else if(x == '-') {
                if(!st_1.isEmpty()) {
                    st_1.pop();
                }
            } else {
                st_1.push(x);
            }
        }
        while(!st_1.isEmpty()) {
            st_2.push(st_1.pop());
        }
        while(!st_2.isEmpty()) {
            System.out.print(st_2.pop());
        }
    }   
}
