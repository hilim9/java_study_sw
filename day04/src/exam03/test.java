package exam03;

public class test {
    public static void main(String[] args) {

        // 소수 구하기 (소수는 자신과 1이외의 정수로 나누어 떨어지지 않는 정수)

        for (int i = 1; i <= 1000; i++){  // 1 ~ 1000까지 판별할 수

            int j;

            for(j = 2; j < i; j++) { // 판별할 수를 나눌 수 (1, 자신 제외)
                
                if (i % j == 0) { // 판별할 수를 나누었을 때 나머지가 0이면 종료
                    break;
                }

            }
            if (i == j) { // 마지막까지 나누어 떨어지지 않았으므로 소수
                System.out.printf("%d ",i);
            }

        }

    }
}
