package exam02;

public class Student { // class: 객체를 만들기 위한 설계 명세서

    // 멤버 변수 정의
    int id; // 학번
    String name; // 학생명
    String subject; // 전공과목

    // 멤버 함수 정의
    void study() {

         System.out.printf("학번: %d, 이름: %s, 전공과목: %s%n",id, name, subject);
    }
}
