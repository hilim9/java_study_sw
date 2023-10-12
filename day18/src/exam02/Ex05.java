package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex05 {
    public static void main(String[] args) {

        // 시간의 불변성 유지
        // 기존 날짜의 불변성이 유지가 된다(Calendar 클래스와 차이점)
        // 새로운 객체 생성
        LocalDate date1 = LocalDate.now();
        //LocalDate date2 = date1.with(ChronoField.MONTH_OF_YEAR, 12);
        LocalDate date2 = date1.withMonth(12);
        
        System.out.println(date1);
        System.out.println(date2);
    }
}
