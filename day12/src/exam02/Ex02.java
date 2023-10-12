package exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {

        Set<Book> books = new HashSet<>();
        books.add(new Book("책1","저자1","출판사1"));
        books.add(new Book("책2","저자2","출판사2"));
        books.add(new Book("책2","저자2","출판사2"));
        books.add(new Book("책3","저자3","출판사3"));
        books.add(new Book("책4","저자4","출판사4"));
        books.add(new Book("책5","저자5","출판사5"));

        /* for (Book book : books) {
            System.out.println(book);
        } */

        // Iterator
        // 커서가 한번 끝까지 이동하면 다시 처음으로 돌아오지 않음 (반복은 1번만 함)
        // 반복을 하고 싶으면 새로 만들어야 한다
        Iterator<Book> iter = books.iterator();
        while(iter.hasNext()){ // hasNext() : 다음 요소가 있는지 체크
            Book book = iter.next(); // next() : 다음 요소를 가져오기
            System.out.println(book);
        }

        // 다시 반복을 하려면 Iterator 객체 생성
        iter = books.iterator();
        while(iter.hasNext()){ // hasNext() : 다음 요소가 있는지 체크
            Book book = iter.next(); // next() : 다음 요소를 가져오기
            System.out.println(book);
        }
    }
}
