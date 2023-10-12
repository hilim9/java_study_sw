package exam01;

import java.time.LocalDate;
import java.util.Scanner;

public class test {
    public static void makeCalender(int year, int month){
        LocalDate calenderDay = LocalDate.of(year, month, 1); //해당 년도와 달의 달력을 가져옴
        int day = calenderDay.getDayOfWeek().getValue(); // 해당 달이 시작하는 요일을 가져옴 (시작은 일=0)
        int lastDay = calenderDay.lengthOfMonth(); // 해당 달의 일수를 가져옴

        //System.out.println("[" + year + "년 " + String.format("%02d",month) +"월]");
        System.out.printf("[%d년 %02d월]%n",year,month);

        System.out.println("일\t월\t화\t수\t목\t금\t토\t");
        for (int i = 0; i < day; i++) {
            System.out.print("\t"); //시작일 만큼 공백
        }

        int date=1;
        for (int i = 0; i < lastDay ; i++, date++) {
            System.out.printf("%02d\t", date);
            day++;
            if(day % 7 == 0){ //일주일 check
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해주세요.[yyyy]: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("달력의 달을 입력해주세요.[mm]: ");
        int month = input.nextInt();
        input.nextLine();
        System.out.println();

        makeCalender(year, month);
    }
}
