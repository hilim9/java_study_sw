package exam01;

public class Student {
    
    static int id; // 학번
    String name; // 이름
    
    String subject; // 전공과목

    public Student() {

    }

    public Student(int _id, String _name, String _subject) {
                            // 지역 변수
        
        // 반환값 정의 x, return x - 무조건 반환값은 객체의 주소값
        // 객체 생성 이후에 해야될 작업들
        // 멤버 변수의 초기화 작업을 주로 진행
        /*
            반환값이 없는이유 (안보이는 이유)
	        주소값을 반환 하지만 매우 중요하므로
	        사용자가 접근하여 변경하지 못하게 내부적으로 숨겨놓음
	        반환값이 주소값으로 정해져 있으므로 return을 써도 동작하지 않는다
        */

        // 힙영역 | 스택영역
        // 객체의 자원  | 지역변수로서 할당받은 값
        id = _id;
        name = _name;
        subject = _subject;
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, subject=%s%n",id, name, subject);
    }
}
