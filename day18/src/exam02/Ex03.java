package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

import static java.time.temporal.ChronoField.*;

public class Ex03 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2023,10,8);

        //int year = date1.get(YEAR);
        int year = date1.getYear();
        //int month = date1.get(MONTH_OF_YEAR);
        int month = date1.getMonthValue();
        //int date = date1.get(DAY_OF_MONTH);
        int date = date1.getDayOfMonth();

        int week = date1.getDayOfWeek().getValue();


        System.out.printf("year=%d, month=%d, date=%d week=%d%n",year, month, date, week);
    }
}
