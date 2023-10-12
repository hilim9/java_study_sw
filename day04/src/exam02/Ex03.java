package exam02;

public class Ex03 {
    public static void main(String[] args) {

        Schedule2 s1 = new Schedule2();
        s1.setYear(2023);
        s1.setMonth(9);
        s1.setDay(8);

        // 객체의 참조변수를 출력할 때 컴파일러가 toString()을 자동으로 추가해준다
        // 참조변수.toString()
        // s1.toString();
        System.out.println(s1); // s1.toString(); 자동으로 추가
        


    }
}
