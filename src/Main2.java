import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.text.*;
import java.math.*;

public class Main2 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate st_Date = LocalDate.parse("02/12/2022", formatter);
        int months = 12;
        LocalDate en_Date = st_Date.plusYears(months);
        System.out.println(en_Date.format(formatter));
    }
}