package src.J05073;

public class Shop {
    private String id;
    private double single_Price, quantity;
    private double goodPrice, Tax, ShipmentFee, Total_Money, GiaBan;
    public Shop(String id, double single_Price, double quantity) {
        this.id = id;
        this.single_Price = single_Price;
        this.quantity = quantity;
        this.goodPrice = this.quantity * this.single_Price;
        if(this.id.startsWith("T")) {
            this.Tax = this.goodPrice * 0.29;
            this.ShipmentFee = this.goodPrice * 0.04;
        } else if (this.id.startsWith("C")) {
            this.Tax = this.goodPrice * 0.1;
            this.ShipmentFee = this.goodPrice * 0.03;
        }
        else if(this.id.startsWith("D")) {
            this.Tax = this.goodPrice * 0.08;
            this.ShipmentFee = this.goodPrice * 0.025;
        }
        else {
            this.Tax =  this.goodPrice * 0.02;
            this.ShipmentFee = this.goodPrice * 0.005;
        }
        if(this.id.endsWith("C")) {
            this.Tax = this.Tax * 95 / 100.0;
        }
        this.Total_Money = (this.goodPrice + this.Tax + this.ShipmentFee) * 1.2;
        this.GiaBan = this.Total_Money / this.quantity;
    }

    @Override
    public String toString() {
        return this.id + " " + String.format("%.2f", this.GiaBan);
    }
}
