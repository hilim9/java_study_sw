package exam02;

import java.time.*;

public class Ex08 {
    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1);

        // LocalDate
        // LocalTime
        LocalDate date2 = date1.toLocalDate();
        LocalTime date3 = date1.toLocalTime();
        System.out.println(date2);
        System.out.println(date3);

        // LocalDateTime
        LocalDateTime date4 = LocalDateTime.of(date2, date3);
        System.out.println(date4);

    }
}
