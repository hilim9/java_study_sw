package exam01;

public class Ex02 {
    public static void main(String [] args) {

        // 문자
        char ch1 = 'A';

        System.out.println(ch1);
        System.out.println(ch1 + 1); // 66
        System.out.println('A' + 'B'); // 131

        char ch2 = '가'; // 한글은 유니코드로 표현(2byte ~ 3byte)
        System.out.println(ch2 + 0); // 44032

        System.out.println('가' < '나'); // true (숫자이기 때문에 가능한 연산)
    }
}
