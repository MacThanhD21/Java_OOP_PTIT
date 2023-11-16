package src.J07047;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Client implements Comparable<Client>{
    private String id, name, room_code;
    private String in_date, out_date;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private Date start, end;
    public int single_Price;
    public double Fee;

    public Client(int id, String name, String room_code, String in_date, String out_date, ArrayList<Hotel> dsHotel) {
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        this.room_code = room_code;
        this.in_date = in_date;
        this.out_date = out_date;
        try {
            this.start = formatter.parse(in_date);
            this.end = formatter.parse(out_date);
        } catch(Exception e) {
            System.out.println(e);
        }

        for(Hotel tmp : dsHotel) {
            if(tmp.getSign().equals(this.room_code.substring(2, 3))) {
                this.single_Price = tmp.getSingle_Price();
                this.Fee = tmp.getFee();
                break;
            }
        }
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getRoom_code() {
        return this.room_code;
    }

    public String getIn_date() {
        return this.in_date;
    }

    public String getOut_date() {
        return this.out_date;
    }

    public long getDateNum() {
        return (this.end.getTime() - this.start.getTime()) / (1000 * 60 * 60 * 24);
    }
    public double getTotalMoney() {
        long date = this.getDateNum();
        if(date < 1) {
            date = 1;
        }
        double totalFee = date * this.single_Price;
        double fee = totalFee * this.Fee;
        
        if(date < 1) {
            totalFee = this.single_Price;
            return (totalFee + fee);
        }
        if(date < 10) {
            return (totalFee + fee);
        }
        else if(date < 20) {
            return (totalFee + fee) * (1 - 0.02);
        }
        else if(date < 30) {
            return (totalFee + fee) * (1 - 0.04);
        }
        else{
            return (totalFee + fee) * (1 - 0.06);
        }
    }
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.room_code  + " " + this.getDateNum() + " " + String.format("%.2f", this.getTotalMoney());
    }

    @Override
    public int compareTo(Client o) {
        return (int)(o.getDateNum() - this.getDateNum());
    }
}
