package src.J05072;

public class Province {
    private String id_P, name_P, call_Fee;

    public Province(String id_P, String name_P, String call_Fee) {
        this.id_P = id_P;
        this.name_P = name_P;
        this.call_Fee = call_Fee;
    }

    public String getId_P() {
        return id_P;
    }


    public String getName_P() {
        return name_P;
    }

    public String getCall_Fee() {
        return call_Fee;
    }
}
