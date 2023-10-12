package exam01;

public class Ex04 {
    public static void main(String[] args) {

        // StringBuffer
        // 버퍼에 크기를 지정해주지 않으면 기본 16바이트로 설정
        StringBuffer sb = new StringBuffer();
        System.out.println(System.identityHashCode(sb));

        // append()를 사용하여 새로운 문자열 추가(결합)가능
        // -> 객체 자신을 반환
        sb.append("ABC");
        sb.append("DEF");
        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));

        // to.String()
        String str = sb.toString();
        System.out.println(System.identityHashCode(str));
        System.out.println(str);

        System.out.println(str == "ABCDEFGHI"); // 동일성 (주소비교)
                        // 객체와 문자열 상수
        System.out.println(str.equals("ABCDEFGHI")); // 동등성(값비교)


    }
}
