
import java.util.ArrayList;
import java.util.Scanner;

class TramDo {
    private String id, name, timeStart, timeEnd;
    private int rainFall;
    private double time;

    public TramDo(String name, String timeStart, String timeEnd, int rainFall) {
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.time = getTime(this.timeStart, this.timeEnd);
        this.rainFall = rainFall;
    }

    public void setId(int n) {
        this.id = "T" + String.format("%02d", n);
    }

    public String getName() {
        return this.name;
    }
    
    public double getTime(String timeStart, String timeEnd) {
        double h = Integer.parseInt(timeEnd.substring(0, 2)) - Integer.parseInt(timeStart.substring(0, 2));
        double m = (double) (Integer.parseInt(timeEnd.substring(3)) - Integer.parseInt(timeStart.substring(3))) / 60;
        return h + m;
    }

    public void update(TramDo p) {
        this.time += p.time;
        this.rainFall += p.rainFall;
    }

    public double getResult() {
        return this.rainFall / this.time;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.2f", this.getResult());
    }
}

public class J05019 {

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
    }
}
