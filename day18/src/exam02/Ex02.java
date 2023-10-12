package exam02;

import java.time.LocalDate;

public class Ex02 {
    public static void main(String[] args) {

        // now()
        LocalDate date1 = LocalDate.now(); // 현재 날짜
        System.out.println(date1);

        // of()                                        // Calendar클래스와 다르게 1 ~ 12
        LocalDate date2 = LocalDate.of(2023,10,4);
        System.out.println(date2);
    }
}
