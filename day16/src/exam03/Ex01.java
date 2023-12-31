package exam03;

public class Ex01 {
    public static void main(String[] args) {

        // 데코레이터 패턴(프록시패턴)

        // ImplCalculator
        long stime = System.nanoTime(); // 추가 기능

        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10); // 핵심 기능
        System.out.println("cal1 : " + result1);

        long etime = System.nanoTime();
        System.out.printf("걸린 시간 : %d%n", etime - stime);


        // RecCalculator
        stime = System.nanoTime();// 추가 기능

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10);// 핵심 기능
        System.out.println("cal2 : " + result2);

        etime = System.nanoTime();// 추가 기능
        System.out.printf("걸린 시간 : %d%n", etime - stime);

    }

}
