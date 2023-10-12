package exam01;

public class Ex03 {
    public static void main(String[] args) {

        // 변경이 불가 하기 때문에 문자열을 결합할때마다 주소변경(객체를 새로 만듬)
        // 기존객체에 담겨진 값은 GC가 제거
        // 문자열 결합을 많이 할 수록 성능 저하 문제가 발생
        String str = "ABC";
        System.out.println(System.identityHashCode(str));

        str += "DEF";
        System.out.println(System.identityHashCode(str));
        
        str += "GHI";
        System.out.println(System.identityHashCode(str));
        System.out.println(str);
    }
}
