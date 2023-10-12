package exam02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex09 {
    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

    }
}
