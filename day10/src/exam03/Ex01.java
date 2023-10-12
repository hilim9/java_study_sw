package exam03;

public class Ex01 {
    public static void main(String[] args) {

        Transportation trans = Transportation.BUS;

        // 열거형 상수는
        // switch case문에서 앞에 있는 자료형을 명시하지 않고 상수명만 사용
        switch (trans) {
            case /*Transportation.*/BUS:
                // 앞에 있는 자료형을 보고 판단하기 때문에 생략, 생략하지 않으면 오류 발생
                // 객체라 가능하다 (객체의 주소값이 담겨있기 때문에 가능)

                System.out.println("버스!");
                break;
            case SUBWAY:
                System.out.println("지하철!");
                break;
            case TAXI:
                System.out.println("택시!");
                break;
        }

       /* if (trans == Transportation.BUS) { // 정적상수이기 때문에 == 비교 가능
            System.out.println("버스!");
        }*/


    }
}
