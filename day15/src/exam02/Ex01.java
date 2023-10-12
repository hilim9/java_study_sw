package exam02;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {

        //String str = "가나다";
        String str = null;
        /*Optional<String> opt = Optional.of(str);
        String str2 = opt.get();
        System.out.println(str2);*/

        Optional<String> opt = Optional.ofNullable(str);
        /*String str2 = opt.get(); // get(): 값이 존재 해야하는 메서드. 없으면 NoSuchElementException 오류 발생
        System.out.println(str2);*/

        // orElse(T other)
        // null이 아니면 값 반환, null이면 other 반환
        String str2 = opt.orElse("가나다");
        System.out.println(str2);
    }
}
