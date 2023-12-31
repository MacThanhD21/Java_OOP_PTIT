import java.util.Scanner;

public class J03029 {

    public static boolean dauNgatCau(char c) {
        return c == '.' || c == '?' || c == '!';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean nextL = true;
        while (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            if (s.isEmpty()) {
                continue;
            }
            String[] tmp = s.split("\\s+");
            for (int i = 0; i < tmp.length; i++) {
                s = tmp[i];
                if (nextL) {
                    nextL = false;
                    s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                }
                System.out.print(s);
                if (dauNgatCau(s.charAt(s.length() - 1))) {
                    System.out.println();
                    nextL = true;
                } else if (i == tmp.length - 1) {
                    System.out.println(".");
                    nextL = true;
                } 
                else if (!tmp[i + 1].equals(".") && !tmp[i + 1].equals("!") && !tmp[i + 1].equals("?")) {
                    System.out.print(" ");
                }
            }
        }
        sc.close();
    }
}