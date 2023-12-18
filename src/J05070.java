import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CLB {
    String idCLB, name;
    int giaVe;

    public CLB(String idCLB, String name, int giaVe) {
        this.idCLB = idCLB;
        this.name = name;
        this.giaVe = giaVe;
    }
}

class TranDau implements Comparable<TranDau> {
    private String id;
    private CLB clb;
    private long soVe, doanhThu;

    public TranDau(String id, long soVe, ArrayList<CLB> dsCLB) {
        this.id = id;
        this.soVe = soVe;
        for (CLB tmp : dsCLB) {
            if (this.id.substring(1, 3).equals(tmp.idCLB)) {
                this.clb = tmp;
                break;
            }
        }
        this.doanhThu = this.clb.giaVe * this.soVe;
    }

    @Override
    public String toString() {
        return this.id + " " + this.clb.name + " " + this.doanhThu;
    }

    @Override
    public int compareTo(TranDau o) {
        // TODO Auto-generated method stub
        if (this.doanhThu != o.doanhThu) {
            return (int) (o.doanhThu - this.doanhThu);
        } else {
            return this.clb.name.compareTo(o.clb.name);
        }
    }
}

public class J05070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<CLB> dsCLB = new ArrayList<>();
        while (n-- > 0) {
            sc.nextLine();
            dsCLB.add(new CLB(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        int m = sc.nextInt();
        ArrayList<TranDau> dsTD = new ArrayList<>();
        while (m-- > 0) {
            dsTD.add(new TranDau(sc.next(), sc.nextLong(), dsCLB));
        }
        Collections.sort(dsTD);
        for (TranDau tmp : dsTD) {
            System.out.println(tmp);
        }
    }
}