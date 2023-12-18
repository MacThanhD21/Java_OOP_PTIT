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

        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("3");
        // System.out.println(a.divide(a.gcd(b)).multiply(b));
        // System.out.println(a.multiply(b));  
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date x1 = sdf.parse("01/01/2003");
            Date x2 = sdf.parse("10/01/2003");
            long days = (x2.getTime() - x1.getTime()) / (1000 * 60 * 60 * 24);
            System.out.println(days);
        } catch (Exception e) {
        }
        
        SimpleDateFormat sdf_G = new SimpleDateFormat("HH:mm:ss");
        try {
            Date x1 = sdf_G.parse("02:00:00");
            Date x2 = sdf_G.parse("04:30:00");
            long Time = (x2.getTime() - x1.getTime()) / (1000);
            long h = Time / 3600;
            long m = (Time % 3600) / 60;
            System.out.println(h + " " + m);
        } catch (Exception e) {
        }

        
    }
}
