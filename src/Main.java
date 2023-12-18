import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. xử lý time
        // String s = "20:00:00 01/01/2003";
        // String t = "22:30:00 03/01/2003";

        // LocalDateTime dateTime1 = LocalDateTime.of(2003, 1, 1, 12, 0, 0);
        // LocalDateTime dateTime2 = LocalDateTime.of(2003, 1, 1, 14, 30, 0); 

        // long minutesDifference = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        // System.out.println(minutesDifference);

        // String t1[] = ("02/03/2003").split("/");
        // String t2[] = "03/05/2003".split("/");

        // LocalDate date1 = LocalDate.of(Integer.parseInt(t1[2]), Integer.parseInt(t1[1]), Integer.parseInt(t1[0]));
        // LocalDate date2 = LocalDate.of(Integer.parseInt(t2[2]), Integer.parseInt(t2[1]), Integer.parseInt(t2[0]));

        // long daysDifference = ChronoUnit.DAYS.between(date1, date2);
        // System.out.println(daysDifference);

        // BigInteger a = new BigInteger("10");
        // BigInteger b = new BigInteger("3");

        // System.out.println(a.multiply(b));  
        
        // Lam Tron
        double a = 2.569754;
        System.out.println(String.format("%.2f", Math.round(a * 100.0) / 100.0));

        Scanner sc = new Scanner(System.in);
        // Mang 2 chieu
        int ar[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3;j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        // Mang 1 chieu
        int arr[] = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
