package src.J07037;

public class Business implements Comparable<Business> {
    private String id, name, number_Student_can_receive;


    public Business(String id, String name, String number_Student_can_receive) {
        this.id = id;
        this.name = name;
        this.number_Student_can_receive = number_Student_can_receive;
    }


    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.number_Student_can_receive;
    }


    @Override
    public int compareTo(Business o) {
        return this.id.compareTo(o.id);
    }
}
