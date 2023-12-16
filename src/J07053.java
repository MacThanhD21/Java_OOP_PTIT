package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Candidate {
    private String id, name, date;
    private double lt_Score, th_Score;

    public Candidate(String id, String name, String date, double lt_Score, double th_Score) {
        this.id = id;
        this.name = name_Standize(name);
        this.date = date;
        this.lt_Score = lt_Score;
        this.th_Score = th_Score;
    }
    public String name_Standize(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase());
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    private double calculateAverageScore() {
        double averageScore = (lt_Score + th_Score) / 2;
        if (lt_Score >= 8 && th_Score >= 8) {
            averageScore += 1;
        } else if (lt_Score >= 7.5 && th_Score >= 7.5) {
            averageScore += 0.5;
        }
        return Math.min(Math.round(averageScore), 10);
    }

    private String calculateClassification() {
        double averageScore = calculateAverageScore();
        if (averageScore < 5) {
            return "Truot";
        } else if (averageScore < 7) {
            return "Trung binh";
        } else if (averageScore < 8) {
            return "Kha";
        } else if (averageScore < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    private int calculateAge() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = sdf.parse(date);
        Date currentDate = new Date();
        return currentDate.getYear() - birthDate.getYear() - 2;
    }

    @Override
    public String toString() {
        try {
            return id + " " + name + " " + calculateAge() + " " + String.format("%.0f", calculateAverageScore()) +
                    " " + calculateClassification();
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }
}

public class J07053 {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Candidate> candidates = new ArrayList<>();
//        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
            String date = sc.nextLine().trim();
            double lt_Score = Double.parseDouble(sc.nextLine());
            double th_Score = Double.parseDouble(sc.nextLine());
            String id = "PH" + String.format("%02d", i + 1);
            candidates.add(new Candidate(id, name, date, lt_Score, th_Score));
        }

        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }
}
