import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PhongBan {
    private String id;
    private String name;

    public PhongBan(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class NhanVien {
    private String id;
    private String name;
    private int lcb;
    private int ngayCong;
    private String pb;

    public NhanVien(String id, String name, int lcb, int ngayCong, List<PhongBan> dsPB) {
        this.id = id;
        this.name = name;
        this.lcb = lcb * 1000;
        this.ngayCong = ngayCong;
        for (PhongBan tmp : dsPB) {
            if (this.id.endsWith(tmp.getId())) {
                this.pb = tmp.getName();
                break;
            }
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLcb() {
        return lcb;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public int getHeSo() {
        char Gr = this.id.charAt(0);
        int soNamCongTac = Integer.parseInt(this.id.substring(1, 3));

        if (Gr == 'A') {
            if (soNamCongTac >= 1 && soNamCongTac <= 3) {
                return 10;
            } else if (soNamCongTac >= 4 && soNamCongTac <= 8) {
                return 12;
            } else if (soNamCongTac >= 9 && soNamCongTac <= 15) {
                return 14;
            } else {
                return 20;
            }
        } else if (Gr == 'B') {
            if (soNamCongTac >= 1 && soNamCongTac <= 3) {
                return 10;
            } else if (soNamCongTac >= 4 && soNamCongTac <= 8) {
                return 11;
            } else if (soNamCongTac >= 9 && soNamCongTac <= 15) {
                return 13;
            } else {
                return 16;
            }
        } else if (Gr == 'C') {
            if (soNamCongTac >= 1 && soNamCongTac <= 3) {
                return 9;
            } else if (soNamCongTac >= 4 && soNamCongTac <= 8) {
                return 10;
            } else if (soNamCongTac >= 9 && soNamCongTac <= 15) {
                return 12;
            } else {
                return 14;
            }
        } else {
            if (soNamCongTac >= 1 && soNamCongTac <= 3) {
                return 8;
            } else if (soNamCongTac >= 4 && soNamCongTac <= 8) {
                return 9;
            } else if (soNamCongTac >= 9 && soNamCongTac <= 15) {
                return 11;
            } else {
                return 13;
            }
        }
    }

    public int getMonthSalary() {
        return this.lcb * this.ngayCong * this.getHeSo();
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.pb + " " + this.getMonthSalary();
    }
}

public class TN02012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<PhongBan> dsPB = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = scanner.next();
            String name = scanner.nextLine().substring(1);
            dsPB.add(new PhongBan(id, name));
        }

        int m = Integer.parseInt(scanner.nextLine());
        List<NhanVien> dsNV = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String id = scanner.nextLine();
            String name = scanner.nextLine().trim();
            int lcb = Integer.parseInt(scanner.nextLine());
            int ngayCong = Integer.parseInt(scanner.nextLine());

            NhanVien nv = new NhanVien(id, name, lcb, ngayCong, dsPB);
            dsNV.add(nv);
        }

        for (NhanVien nv : dsNV) {
            System.out.println(nv);
        }
    }
}
