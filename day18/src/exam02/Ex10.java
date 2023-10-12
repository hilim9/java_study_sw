package exam02;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex10 {
    public static void main(String[] args) {

        // withZoneSameInstant()
        ZonedDateTime kor = ZonedDateTime.now();
        ZonedDateTime rome = kor.withZoneSameInstant(ZoneId.of("Europe/Rome"));
        ZonedDateTime newYork = kor.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("ASIA/SEOUL : " + kor);
        System.out.println("EUROPE/ROME : " + rome);
        System.out.println("AMERICA/NEW_YORK : " + newYork);
    }
}
