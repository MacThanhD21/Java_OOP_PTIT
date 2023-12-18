import java.util.*;
import java.io.*;
import java.time.*;
import java.text.*;
import java.math.*;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0) {
            String s = sc.nextLine();
            boolean ok = true;
            if(s.charAt(0) == '0') {
                ok = false;
            }
            for(char x : s.toCharArray()) {
                if(!Character.isDigit(x)) {
                    ok = false;
                    break;
                }
            }
            if(!ok) {
                System.out.println("INVALID");
                continue;
            } 
            else {
                int oddCount = 0;
                int evenCount = 0;
                for(char c : s.toCharArray()) {
                    if((c - '0') % 2 == 0) {
                        evenCount++;
                    }
                    else {
                        oddCount++;
                    }
                }
                if(oddCount == evenCount) {
                    System.out.println("NO");
                }
                else {
                    if(s.length() % 2 == 0 && evenCount > oddCount) {
                        System.out.println("YES");
                    }
                    else if(s.length() % 2 == 1 && oddCount > evenCount) {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}