package exam03;

public class Ex04 {
    public static void main(String[] args) {
        Book b1 = new Book("책1", "저자1", "출판사1");
        Book b2 = new Book("책1", "저자1", "출판사1");

        System.out.printf("b1 == b2 : %s%n", b1 == b2); // 동일성 비교
        System.out.printf("b1.equals(b2) : %s%n", b1.equals(b2)); // 동등성 비교(재정의 되었을 때)

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(System.identityHashCode(b1));


    }
}
