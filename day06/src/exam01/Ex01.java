package exam01;

public class Ex01 {
    public static void main(String[] args) {

        // Calculator cal = new Calculator();


        Calculator cal = new SimpleCalculator();

        int result = cal.add(10, 20);
        System.out.println(result);

        // 완전히 구현된 인스턴스 메서드와 멤버변수 정의가 가능
        System.out.println(cal.num);
        cal.commonMethod();

    }
}
