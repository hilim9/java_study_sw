package exam03;

public class ProxyCalculator implements Calculator{

    // 데코레이터 패턴(프록시패턴)

    // private ImplCalculator calculator = new ImplCalculator();
    private Calculator calculator;

    public ProxyCalculator (Calculator calculator) { // 다형성
                            // ImplCalculator calculator
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); // 추가 기능
        try {

            long result = calculator.factorial(num); // 핵심기능

            return result;
        } finally {
            long etime = System.nanoTime(); // 추가 기능
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}
