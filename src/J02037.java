
import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0) {
            String[] s = sc.nextLine().split("\\s+");

            int cntOdd = 0; int cntEven = 0;
            for(int i = 0; i < s.length; i++) {
                if(Integer.parseInt(s[i]) % 2 == 0) cntEven++;
                else cntOdd++;
            }

            if(s.length % 2 == 0) {
                if(cntEven > cntOdd) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                if(cntOdd > cntEven) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }   
}
