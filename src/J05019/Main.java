package src.J05019;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<TramDo> ds = new ArrayList<>();
        int stt = 1;
        while (t-- > 0) {
            sc.nextLine();
            TramDo tmp = new TramDo(sc.nextLine(), sc.next(), sc.next(), sc.nextInt());
            int check = 0;
            for (TramDo x : ds) {
                if (x.getName().equals(tmp.getName())) {
                    check = 1;
                    x.update(tmp);
                    break;
                }
            }
            if (check == 0) {
                tmp.setId(stt++);
                ds.add(tmp);
            }
        }
        for (TramDo tmp : ds) {
            System.out.println(tmp);
        }
        sc.close();
    }
}
