package exam02;

public class Ex02 {
    public static void main(String[] args) {

        // Object 클래스
        // 모든 클래스의 상위 클래스 이기 때문에
        // 다형성으로 담을 수 있다

        /* Object human = new Human();
        Object tiger = new Tiger();
        Object bird = new Bird(); */

        /* Human human = new Human();
        Tiger tiger = new Tiger();
        Bird bird = new Bird(); */

        // Object[] animals = { human, tiger, bird };

        Object[] animals = {
            new Human(),
            new Tiger(),
            new Bird()
        };
    }
}
