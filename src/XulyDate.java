package Javaa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XulyDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        // Thời điểm bắt đầu
        String startTime = "09:30";
        // Thời điểm kết thúc
        String endTime = "12:45";

        try {
            System.out.println(Math.ceil(8.0/3));
            // Chuyển các chuỗi thời gian thành đối tượng Date
            Date startDate = sdf.parse(startTime);
            Date endDate = sdf.parse(endTime);

            // Tính số phút giữa hai thời điểm
            long diffInMillies = Math.abs(endDate.getTime() - startDate.getTime());
            long diffInMinutes = (diffInMillies / (1000 * 60));

            System.out.println("Số phút giữa " + startTime + " và " + endTime + " là: " + diffInMinutes + " phút.");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
