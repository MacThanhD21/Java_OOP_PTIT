package src.J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String id, name, single_Price, fee_service;


    public LoaiPhong(String s) {
        String[] res = s.split("\\s+");
        this.id = res[0];
        this.name = res[1];
        this.single_Price = res[2];
        this.fee_service = res[3];
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.single_Price + " " + this.fee_service;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.name);
    }
}
