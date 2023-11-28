package src.J05072;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Province> dsProvince = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            dsProvince.add(new Province(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        ArrayList<Phone> dsCall = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            String s[] = sc.nextLine().split("\\s+");
            dsCall.add(new Phone(s[0], s[1], s[2], dsProvince));
        }
        Collections.sort(dsCall, new Comparator<Phone>(){
            @Override
            public int compare(Phone o1, Phone o2) {
                return o2.getFee() - o1.getFee();
            }
        });
        for(Phone x : dsCall) {
            System.out.println(x);
        }
    }
}
