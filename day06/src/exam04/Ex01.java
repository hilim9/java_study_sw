package exam04;

public class Ex01 {
    public static void main(String[] args) {

        // 클래스에서 상속은 하나의 클래스만 상속 가능(자바)
        // 다중 상속시 동일한 메서드가 각각 정의되면 어느쪽을 실행할지 알 수 없다

        C c = new C();
        c.method();
    }
}
