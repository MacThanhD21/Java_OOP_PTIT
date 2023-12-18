import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Customer implements Comparable<Customer>{
    private String id, name, gender, ns, addr;
    private String nsXet;

    public Customer(int id, String name, String gender, String ns, String addr) {
        this.id = String.format("KH%03d", id);
        this.name = chuanhoa(name);
        this.gender = gender;
        this.ns = ns;
        if(this.ns.charAt(1) == '/') {
            this.ns = "0" + this.ns;
        }
        if(this.ns.charAt(4) == '/') {
            this.ns = this.ns.substring(0, 3) + "0" + this.ns.substring(3);
        }
        this.nsXet = this.ns.substring(6) + this.ns.substring(3, 5) + this.ns.substring(0, 2);
        this.addr = addr;
    }
    public String chuanhoa(String name) {
        String[] res = name.split("\\s+");
        String ans = "";
        for(String x : res) {
            ans += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }
        return ans.trim();
    }
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + gender + " " + this.addr + " " + this.ns;
    }
    @Override
    public int compareTo(Customer o) {
        return this.nsXet.compareTo(o.nsXet);
    }
}
public class J07025 {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner sc = new Scanner(new File("KHACHHANG.in"));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> ar = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ar.add(new Customer(i + 1, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim()));
        }
        Collections.sort(ar);
        for(Customer x : ar) {
            System.out.println(x);
        }
    }    
}
