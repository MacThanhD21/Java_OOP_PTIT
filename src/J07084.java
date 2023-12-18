import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
class Time implements Comparable<Time>{
    private String name, in_Time, ou_Time;
    private int total_Time;


    public Time(String name, String in_Time, String ou_Time) {
        this.name = name;
        this.in_Time = in_Time;
        this.ou_Time = ou_Time;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            Date date_1 = sdf.parse(this.in_Time);
            Date date_2 = sdf.parse(this.ou_Time); 
            this.total_Time = (int) ((date_2.getTime() - date_1.getTime()) / (1000 * 60));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.total_Time;
    }

    @Override
    public int compareTo(Time o) {
        return o.total_Time - this.total_Time;
    }
}
public class J07084 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        // Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Time> timeList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String in_Time = sc.nextLine();
            String ou_Time = sc.nextLine();
            timeList.add(new Time(name, in_Time, ou_Time));
        }
        Collections.sort(timeList);
        for(Time x : timeList) {
            System.out.println(x);
        }
    }
}