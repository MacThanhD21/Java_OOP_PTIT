package src.J05019;

public class TramDo {
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
