package exam02;

import java.util.Optional;

public class Ex03 {
    public static void main(String[] args) {

        String str = null;
        Optional<String> opt = Optional.ofNullable(str);

        // orElseThrow() : null이면 예외 발생
        String str2 = opt.orElseThrow(IllegalArgumentException::new); // get()과 동일
                                        // () -> new IllegalArgumentException



    }
}
