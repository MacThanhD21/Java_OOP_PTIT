package src.J07047;

public class Hotel {
    private String sign, name_Room;
    private int single_Price;
    private double Fee;

    public Hotel(String sign, String name_Room, int single_Price, double Fee) {
        this.sign = sign;
        this.name_Room = name_Room;
        this.single_Price = single_Price;
        this.Fee = Fee;
    }
    public String getSign() {
        return this.sign;
    }

    public String getName_Room() {
        return this.name_Room;
    }

    public int getSingle_Price() {
        return this.single_Price;
    }

    public double getFee() {
        return this.Fee;
    }
}