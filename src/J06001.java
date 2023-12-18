
import java.util.*;
import java.math.*;
import java.io.*;


class Prod {
    private String id, name;
    private int mon_1, mon_2;

    public Prod(String id, String name, int mon_1, int mon_2) {
        this.id = id;
        this.name = name;
        this.mon_1 = mon_1;
        this.mon_2 = mon_2;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getMon_1() {
        return this.mon_1;
    }

    public int getMon_2() {
        return this.mon_2;
    }
}

class Bill {
    private String id;
    private int quantity;
    private Prod product;
    private long disC, total_M, real_M;
    public static int count = 1;
    public Bill(String id, int quantity,ArrayList<Prod> products) {
        this.id = id + String.format("-%03d", count++);
        this.quantity = quantity;
        for(Prod x : products) {
            if(x.getId().equals(this.id.substring(0, 2))) {
                this.product = x;
                break;
            }
        }
        if(this.id.charAt(2) == '1') {
            this.total_M = this.product.getMon_1() * this.quantity;
        }
        else {
            this.total_M = this.product.getMon_2() * this.quantity;
        }
        if(this.quantity >= 150) {
            this.disC = Math.round(this.total_M * 0.5);
        }
        else if(this.quantity >= 100) {
            this.disC = Math.round(this.total_M * 0.3);
        }
        else if(this.quantity >= 50) {
            this.disC = (int)(this.total_M * 0.15);
        }
        else {
            this.disC = 0;
        }
        this.real_M = this.total_M - this.disC;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.product.getName() + " " + this.disC + " " + this.real_M;
    }
}

public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Prod> products = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            products.add(new Prod(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList <Bill> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new Bill(sc.next(), Integer.parseInt(sc.nextLine().substring(1)), products));
        }

        for(Bill x : arr) {
            System.out.println(x);
        }
    }
}
