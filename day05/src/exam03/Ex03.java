package exam03;

public class Ex03 {
    public static void main(String[] args) {
            Human human = new Human();
            human.move();
            // 메서드가 재정의 되어있으면
            // 상위 클래스가(Animal) 아닌 자신에게 있는(human) 메서드를 먼저 사용한다
            // 메서드명과 매개변수가 같아도 다른 메서드이다

    }
}
