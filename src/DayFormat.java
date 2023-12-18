import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
public class DayFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate date = LocalDate.now();
        System.out.println(date.plusDays(1));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);
    }
}
