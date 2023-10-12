package exam03;

public class Ex02 {
    public static void main(String[] args) {

        // 데코레이터 패턴(프록시패턴)

        // ProxyCalculator cal1 = new ProxyCalculator(new ImplCalculator());
        Calculator cal1 = new ProxyCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);
        System.out.println("cal1 : " + result1);

        Calculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);
        System.out.println("cal1 : " + result2);
    }
}
