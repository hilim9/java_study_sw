package exam03;

public class RecCalculator implements Calculator{

    // 구조는 간단, ImplCalculator보다 성능 떨어짐
    @Override
    public long factorial(long num) {

        if (num < 1) //num = 1;
            return 1;
        return num * factorial(num - 1);

        /*long stime = System.nanoTime();

        try {

        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }*/
    }
}
