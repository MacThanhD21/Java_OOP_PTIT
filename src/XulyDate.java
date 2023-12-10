package src;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class XulyDate {
    public static void main(String[] args) {
        // Thời gian ban đầu
        LocalTime time1 = LocalTime.parse("01:02:03");
        LocalTime time2 = LocalTime.parse("03:04:03");

        // Tính khoảng cách giữa hai thời gian
        long hours = Math.abs(ChronoUnit.HOURS.between(time1, time2));
        long minutes = Math.abs(ChronoUnit.MINUTES.between(time1, time2)) % 60;
        long seconds = Math.abs(ChronoUnit.SECONDS.between(time1, time2)) % 60;

        // In ra kết quả
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
