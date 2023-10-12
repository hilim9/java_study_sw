package exam03;

public class Human extends Animal{

    @Override // 오류 방지 (오타 방지), 재정의된 메서드임을 알려주는 애노테이션
    public void move() {
        System.out.println("두발로 직립보행");
    }
    
    public void reading() {
        System.out.println("독서를 한다");
    }

}
