import java.io.*;
import java.util.*;

public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
        // Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(sc.nextLine());
        // String[] arr = new String[n];
        // for(int i = 0; i < n; i++) {
        //     arr[i] = sc.nextLine();
        // }
        for(String s : arr) {
            int sum = 0;
            String res = "";
            for(char x : s.toCharArray()) {
                if (Character.isDigit(x))  {
                    res += x;
                    sum += (x - '0');
                }
            }
            while(res.startsWith("0")) res = res.substring(1);
            System.out.println(res + " " + sum);
        }
    }
}
