package exam01;

public class UserPwException extends RuntimeException{
    // 유연한 예외
    // 예외가 발생하더라도 컴파일이 되기 때문에
    // RuntimeException을 더 많이 사용
    public UserPwException(String message) {
        super(message);
    }
}
