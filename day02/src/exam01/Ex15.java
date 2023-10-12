package exam01;

public class Ex15 {
    public static void main(String[] args) {

        int total = 0;
        for (int num = 1; num <= 100; num++) {

                /*if ( num == 50) {
                    break;
                }*/
                /*if (num % 2 == 1) { // 홀수
                    total += num;
                }*/
                if (num % 2 == 0) { // 짝수
                    continue;
                }

                total += num;
        }

        System.out.println(total);
    }
}
