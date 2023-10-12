package exam02;

import java.util.StringTokenizer;

public class Ex11 {
    public static void main(String[] args) {

        String str = "Apple,Orange,#Melon,+Banana";

        // StringTokenizer(String str, String delim)
        // delim를 기준으로 문자열을 가져옴
        // 하나의 덩어리가(,#+) 아니고 각각의 문자로 구분 ( , # + )
        StringTokenizer st = new StringTokenizer(str, ",#+");
        while(st.hasMoreTokens()) {
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
