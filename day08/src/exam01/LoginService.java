package exam01;

public class LoginService {
    public void login(String userId, String userPw) /*throws UserIdException, UserPwException*/{

                                                    // 예외 처리 미루기
                                                    // 메서드를 호출 하는쪽에서 예외 처리 전가
                                                    // 전가시키는 예외에 대해서 명시(throws)
        /**
        *  userId - user01
        *  userPw - 1234
        */

        /*try {
            if (!userId.equals("user01")) {
                throw new UserIdException("가입되지 않은 회원입니다");
            }

            if (!userPw.equals("1234")) {
                throw new UserPwException("비밀번호가 일치하지 않습니다");
            }

            // 아이디와 비번이 전부 일치하는 경우
            System.out.println("로그인 완료!");

        } catch (UserIdException | UserPwException e) {
            // 상위 클래스로 설정하거나 다중 처리 사용
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }*/

        if (!userId.equals("user01")) {
            throw new UserIdException("가입되지 않은 회원입니다");
        }

        if (!userPw.equals("1234")) {
            throw new UserPwException("비밀번호가 일치하지 않습니다");
        }

        // 아이디와 비번이 전부 일치하는 경우
        System.out.println("로그인 완료!");
    }

}
