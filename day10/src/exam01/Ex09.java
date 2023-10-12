package exam01;

public class Ex09 {
    public static void main(String[] args) {

        // isEmpty( )
        // 값이 비어있을 때
        String str1 = "";
        System.out.println("str1.isEmpty(): " + str1.isEmpty()); // true

        // 공백
        String str2 = " ";
        System.out.println("str2.isEmpty(): " + str2.isEmpty()); // false

        // isBlank( ) (JDK11)
        // 값이 비어있거나, 공백일 때 true
        String str3 = "";  // 값이 비어있을 때
        System.out.println("str3.isBlank(): " + str3.isBlank());

        String str4 = " "; // 공백
        System.out.println("str4.isBlank(): " + str4.isBlank());

    }
}
