package exam03;

public class ImplCalculator implements Calculator{
    
    // RecCalculator보다 성능이 좋음
    @Override
    public long factorial(long num) {

        long total = 1L;
        for (long i = 1L; i <= num; i++) {
            total *= i;
        }

        return total;

        /*long stime = System.nanoTime();
        try {
            long total = 1L;
            for (long i = 1L; i <= num; i++) {
                total *= i;
            }

            return total;
            //  try - finally를 사용하게 되면 return이 있어도 실행 됨
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }*/
    }
}

