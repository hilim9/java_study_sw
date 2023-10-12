package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        System.out.println(num1 == num2); // 동일성

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true


    }
}
