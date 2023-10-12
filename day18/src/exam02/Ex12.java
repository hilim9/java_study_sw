package exam02;

import java.time.Instant;

public class Ex12 {
    public static void main(String[] args) {

        // Instant
        // 1970.1.1 자정부터(00:00:00 UTC+0) 1/1000초 단위로 카운팅한 수치
        Instant date1 = Instant.now();
        //System.out.println(date1);
        long time = date1.getEpochSecond(); // timestamp
        System.out.println(time);

        long time2 = date1.toEpochMilli(); // System.currentTimeMillis()
        System.out.println(time2);


    }
}
