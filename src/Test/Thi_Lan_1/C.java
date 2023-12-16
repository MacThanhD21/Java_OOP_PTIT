import java.lang.invoke.ClassSpecializer.Factory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, msv, name, ns, convince;

    public Student(int id, String msv, String name, String ns, String convince) {
        this.id = "SV" + String.format("%03d", (id));
        this.msv = msv;
        this.name = chuanHoa(name);
        this.ns = ns;
        if(this.ns.charAt(0) == '/') {
            this.ns = "0" + this.ns;
        }
        if(this.ns.charAt(3) == '/') {
            this.ns = this.ns.substring(0, 3) + "0" + this.ns.substring(3);
        }
        this.convince = convince;
    }

    public String chuanHoa(String name) {
        String[] arr = name.trim().toLowerCase().split("\\s+");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
            if (i < arr.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public String getAge() {
        String res = this.ns.substring(6) + this.ns.substring(3, 5) + this.ns.substring(0, 2);
        return res;
    }
    public String getId() {
        return this.id;
    }

    public String getMsv() {
        return this.msv;
    }  

    public String getName() {
        return this.name;
    }

    public String getNs() {
        return this.ns;
    }
    public String getConvince() {
        return this.convince;
    }
    @Override
    public String toString() {
        return id + " " + msv + " " + name + " " + ns + " " + convince;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub

    }
}
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Student> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String ns = sc.nextLine();
            String convince = sc.nextLine();
            arr.add(new Student(i + 1, msv, name, ns, convince));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            int type = Integer.parseInt(sc.nextLine());
            if (type == 1) {
                Collections.sort(arr, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        // TODO Auto-generated method stub
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                String convince = sc.nextLine();
                boolean ok = false;
                for(Student x : arr) {
                    if(x.getConvince().equals(convince)) {
                        System.out.println(x);
                        ok = true;
                    }
                }
                if (!ok) {
                    System.out.println("-1");
                }
                System.out.println();
            }
            else if(type == 2) {
                String yea = sc.nextLine();
                Collections.sort(arr, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        // TODO Auto-generated method stub
                        return o2.getAge().compareTo(o1.getAge());
                    }
                });
                boolean ok = false;
                for(Student x : arr) {
                    if(x.getNs().substring(6).equals(yea)) {
                        System.out.println(x);
                        ok = true;
                    }
                }
                if (!ok) {
                    System.out.println("-1");
                }
                System.out.println();
            }
            else if(type == 3) {
                Collections.sort(arr, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        // TODO Auto-generated method stub
                        return o1.getId().compareTo(o2.getId());
                    }
                });
                for(Student x : arr) {
                    System.out.println(x);
                }
                System.out.println();
            }
            else {
                String s = sc.nextLine();
                boolean ok = false;
                for(Student x : arr) {
                    if(x.getName().indexOf(s) != -1) {
                        System.out.println(x);
                        ok = true;
                    }
                }
                if (!ok) {
                    System.out.println("-1");
                }
            }
        }
    }
}
