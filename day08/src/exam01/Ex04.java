package exam01;

public class Ex04 {
    public static void main(String[] args) {

        LoginService service = new LoginService();

        // 예외 처리 미루기
        // 예외 처리를 메서드를 호출하는 쪽에서 함
        try {
            service.login("user01","1234");
        } catch (UserIdException | UserPwException e) {
            System.out.println(e.getMessage());
        }
    }
}
