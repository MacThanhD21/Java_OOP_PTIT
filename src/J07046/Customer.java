package src.J07046;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Customer implements Comparable<Customer>{
    private String id, name, id_Room, in_Date, out_Date;
    private Date start, end;
    private SimpleDateFormat fomatter = new SimpleDateFormat("dd/MM/yyyy");

    public Customer(int id, String name, String id_Room, String in_Date, String out_Date) {
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        this.id_Room = id_Room;
        this.in_Date = in_Date;
        this.out_Date = out_Date;
        try {
            this.start = fomatter.parse(this.in_Date);
            this.end = fomatter.parse(this.out_Date);
        } catch (Exception e) {
        }
    }
    public long getTime() {
        return (this.end.getTime() - this.start.getTime()) / (1000 * 60 * 60 * 24);
    }
    @Override
    public String toString() {
        return this.id
        + " " + this.name 
        + " " + this.id_Room 
        + " " + this.getTime();
    }
    @Override
    public int compareTo(Customer o) {
        return (int)(o.getTime() - this.getTime());
    }

}
