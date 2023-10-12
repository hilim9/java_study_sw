package exam01;

import java.time.LocalDate;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("달력의 년도를 입력해주세요 [yyyy]: ");
        int year = sc.nextInt();

        System.out.print("달력의 월을 입력해주세요 [mm]: ");
        int month = sc.nextInt();

        makeCalender(year, month);

    }

    public static void makeCalender(int year, int month) {

        int date = 1;

        LocalDate CalenderDay = LocalDate.of(year, month, date); // 해당 년도
        int day = CalenderDay.getDayOfWeek().getValue(); // 해당 월이 시작하는 요일
        int lastDate = CalenderDay.lengthOfMonth(); // 해당 월의 마지막 날짜

        //System.out.println(day);
       // System.out.println(lastDate);

        System.out.println();
        System.out.printf("[%d년 %02d월]%n",year,month);

        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for (int i = 0; i < day; i++) {
            if (day != 7) System.out.print("\t"); // 7이 아닐 때만 공백 출력 (일요일 = 7)
        }

        for (int i = 0; i < lastDate; i++) {
            System.out.printf("%02d\t", date++);
            day++;
            if (day % 7 == 0) { // 일주일 단위로 개행
                System.out.println();
            }
        }

        System.out.println(day);

    }
}
