package exam01;

public class Ex05 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        // 메서드 체이닝
        sb.append("ABC").append("DEF");

        // append() -> 객체 자신을 반환
        /*StringBuffer sb2 = sb.append("ABC");

        StringBuffer sb3 = sb2.append("DEF");

        System.out.println(sb == sb2);

        System.out.println(sb2 == sb3);*/

        String str1 = sb.toString();

    }
}
