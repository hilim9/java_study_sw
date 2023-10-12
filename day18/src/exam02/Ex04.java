package exam02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        int yoil = dayOfWeek.getValue(); // 1 ~ 7 요일 ex) 1 월요일
        System.out.println(yoil);

        // getDisplayName()
        String yoilStr1 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH); // Wed
        String yoilStr2 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.ENGLISH); // W
        String yoilStr3 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH); // WEDNESDAY

        System.out.printf("SHORT=%s, NARROW=%S, FULL=%S",yoilStr1,yoilStr2,yoilStr3);
    }
}
