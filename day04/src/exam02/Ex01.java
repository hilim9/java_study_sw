package exam02;

public class Ex01 {
    public static void main(String[] args) {

        Schedule s1 = new Schedule();
        
        // 통제 불가
        /* s1.year = 2023;
        s1.month = 2;
        s1.day = 31; */
        
        // 통제 가능
        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(31);

        s1.showInfo();

        int year = s1.getYear();
        int month = s1.getMonth();
        int day = s1.getDay();

        System.out.println(s1.getMonth());
        System.out.println(month);
    }
}
