package exam02;

public class Ex06 {
    public static void main(String[] args) {

        // valueOf()
        // 숫자의 범위가 작으면 같은 객체 사용
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);
        System.out.println("i1 주소: " + System.identityHashCode(i1));
        System.out.println("i2 주소: " + System.identityHashCode(i2));

        // 숫자의 범위가 크면 새로운 객체를 생성
        Integer i3 = Integer.valueOf(100000);
        Integer i4 = Integer.valueOf(100000);
        System.out.println(i3 == i4);
        System.out.println("i3 주소: " + System.identityHashCode(i3));
        System.out.println("i4 주소: " + System.identityHashCode(i4));
    }
}
