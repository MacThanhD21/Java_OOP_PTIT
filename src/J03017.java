import java.util.Scanner;

public class J03017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String s = sc.nextLine();
            String tmp = s;
            String res = "100";
            while (s.contains(res)) {
                s = s.replace(res, ""); // Reassign the updated string after replacement
            }
            System.out.println(tmp.length() - s.length());
        }
    }
}
