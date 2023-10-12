package exam03;

public class Ex02 {
    public static void main(String[] args) {

        //  int ordinal() : Enum 상수가 정의된 위치 번호(0부터 시작)
        //	String name(): 상수명을 문자열로 변경
        Transportation trans = Transportation.TAXI;
        System.out.printf("trans.ordinal(): %d, trans.name() : %s%n",trans.ordinal(),trans.name());
    }
}
