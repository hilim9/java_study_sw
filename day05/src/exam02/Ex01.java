package exam02;

public class Ex01 {
    public static void main(String[] args) {
        B b = new B();

        // 상속을 통한 부모의 자원 접근 가능
        b.numA = 20;
        System.out.println(b.numA);

    }
}
