package exam03;

import static exam03.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {

        // Transportation trans = new Transportation();
        // private 이기 때문에 불가

        // Transportation trans = Transportation.BUS;

        // import static exam03.Transportation.*
        // 클래스명 생략하고 사용가능
        Transportation trans = BUS;
        System.out.println(trans.getTitle());
        System.out.println(trans.getBasicFare(10));

    }
}
