package src.J05071;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Phone {
    private String id, st_Time, en_Time;
    Date d1, d2;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    private Province pr;
    public Phone(String id, String st_Time, String en_Time, ArrayList<Province> dsProvince) {
        this.id = id;
        this.st_Time = st_Time;
        this.en_Time = en_Time;
        try {
            d1 = sdf.parse(st_Time);
            d2 = sdf.parse(en_Time);
        } catch (Exception e) {
            System.out.println(e);
        }
        for(Province x : dsProvince) {
            if(this.id.substring(1, 3).equals(x.getId_P())) {
                this.pr = x;
                break;
            }
        }
    }


    public String getId() {
        return id;
    }

    public String getSt_Time() {
        return st_Time;
    }

    public String getEn_Time() {
        return en_Time;
    }
    public int getTime() {
        int Time = (int) Math.abs(d1.getTime() - d2.getTime()) / (1000 * 60);
        if(this.id.startsWith("0"))
            return Time;
        else
            return (int)Math.ceil(Time * 1.0 / 3);
    }
    public int getFee() {
        int Time = this.getTime();
        if(this.id.startsWith("0")) {
            return Integer.parseInt(this.pr.getCall_Fee()) * Time;
        }
        else {
            return (800) * Time;
        }
    }

    @Override
    public String toString() {
        if(this.id.startsWith("0")) {
            return this.id
                    + " " + this.pr.getName_P()
                    + " " + this.getTime()
                    + " " + this.getFee();
        }
        else {
            return this.id + " Noi Mang " + this.getTime() + " " + this.getFee();
        }
    }
}
