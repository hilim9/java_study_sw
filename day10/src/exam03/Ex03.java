package exam03;

public class Ex03 {
    public static void main(String[] args) {

        // static T valueOf( ) : 변환메서드
        // 문자열  -> Enum 상수로 변환
        String str = "BUS";
        /*Transportation bus = Enum.valueOf(Transportation.class, str);
        System.out.println(bus);*/

        // 컴파일러가 자동 추가해주는 메서드
        // 문자열 -> 현재 Enum클래스의 상수 변환
        // .valueOf(String name)
        Transportation bus = Transportation.valueOf(str);
        System.out.println(bus);
    }
}
