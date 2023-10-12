package exam03;

public class Ex01 {
    public static void main(String[] args) {
        
        Book b1 = new Book("책1","저자1","출판사1");
        System.out.println(b1); // Object::toString() -> exam03.Book@10f87f48
                                // 재정의 -> Book{title='책1', author='저자1', publisher='출판사1'}
        System.out.println(System.identityHashCode(b1));

    }
}
