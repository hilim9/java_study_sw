package exam02;

import java.util.Calendar;

import static java.util.Calendar.*;

public class Ex01 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance(); // 추상클래스 이므로 getInstance()로 생성
        //System.out.println(cal);
        printDate(cal);

        // 시간의 불변성 유지가 안됨 (기존 값이 변경되므로 원래 시간을 알 수 없다)
        cal.set(DATE, 20);
        printDate(cal);

        cal.add(DATE, 100); // 100일 후
        printDate(cal);

        cal.add(DATE, -100); // 100일 전
        printDate(cal);

        cal.roll(DATE, 100); // 일 + 100 ex) 20일 + 100 (31일 될 시 1부터 다시 증가)
        printDate(cal);


    }

    public static void printDate(Calendar cal) {

        String dateStr = String.format("%d-%d-%d"
                ,cal.get(YEAR)
                , cal.get(MONTH) + 1 // 1 ~ 12가 아니라 0 ~ 11
                , cal.get(DAY_OF_MONTH));
        String timeStr = String.format("%d:%d:%d"
                , cal.get(HOUR_OF_DAY) // 24시간 체계, HOUR 12시간 체계
                , cal.get(MINUTE)
                , cal.get(SECOND));

        System.out.println(dateStr + " " + timeStr);
    }
}
