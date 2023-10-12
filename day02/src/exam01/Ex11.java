package exam01;

public class Ex11 {
    public static void main(String[] args) {

        // 조건문 - if
        // 참, 거짓을 판별하는 식이 포함
        int age = 12;
        if (age < 8) {
            System.out.println("유치원생");
        } else if (age < 14) { // age >= 8 && age < 14 이 거짓일때 실행
            System.out.println("초등학생");
        } else if (age < 17) {  // age >= 14 && age < 17 이 거짓일때 실행
            System.out.println("중학생");
        } else if (age < 20) {  // age >= 17 && age < 20 이 거짓일때 실행
            System.out.println("고등학생");
        } else {
            System.out.println("성인!");
        }
    }
}
