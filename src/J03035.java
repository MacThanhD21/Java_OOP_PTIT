// package src;
import java.util.Scanner;

public class J03035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int t = 0; t < testCases; t++) {
            String A = sc.next();
            String B = sc.next();

            int count = countNumbers(A, B);
            System.out.println(count);
        }
    }

    public static int countNumbers(String A, String B) {
        int count = 0;
        count = countHelper(A.toCharArray(), B.toCharArray(), 0);
        return count;
    }

    public static int countHelper(char[] A, char[] B, int index) {
        if (index == A.length) {
            return (Integer.parseInt(String.valueOf(A)) > Integer.parseInt(String.valueOf(B))) ? 1 : 0;
        }

        if (A[index] == '?') {
            int result = 0;
            for (char c = '0'; c <= '9'; c++) {
                A[index] = c;
                result += countHelper(A, B, index + 1);
                A[index] = '?'; 
            }
            return result;
        } else {
            return countHelper(A, B, index + 1);
        }
    }
}
