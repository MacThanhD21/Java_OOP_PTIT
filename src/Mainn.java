import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
class Time implements Comparable<Time>{
    private String id, name, in_Time, ou_Time;
    private int hour, minute;
    public Time(String id, String name, String in_Time, String ou_Time) {
        this.id = id;
        this.name = name;
        this.in_Time = in_Time;
        this.ou_Time = ou_Time;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date date_1 = sdf.parse(this.in_Time);
            Date date_2 = sdf.parse(this.ou_Time); 
            this.hour = (int) ((date_2.getTime() - date_1.getTime()) / (1000 * 60 * 60));
            this.minute = (int) ((date_2.getTime() - date_1.getTime()) / (1000 * 60) % 60);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Override 
    public String toString() {
        return this.id + " " + this.name + " " + this.hour + " gio " + this.minute + " phut";
    }
    @Override
    public int compareTo(Time o) {
        if(this.hour != o.hour) {
            return o.hour - this.hour;
        } else {
            return o.minute - this.minute;
        }
    }
}
public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Time> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new Time(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(Time x : arr) {
            System.out.println(x);
        }
    }
}