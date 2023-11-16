package src.J07046;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("KHACH.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Customer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(Customer x : arr) {
            System.out.println(x);
        }
        sc.close();
    }
}