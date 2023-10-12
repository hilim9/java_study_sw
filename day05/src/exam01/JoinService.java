package exam01;

public class JoinService {

    // 싱글톤 패턴
    // 필요할때만 객체를 1번만 생성하고 공유하는 패턴

    private static JoinService instance;
    // new 연산자를 사용하지 않고 필요할 때만 사용하게 함
    // private static JoinService instance = new JoinService();


    private JoinService() {

    }

    public static JoinService getInstance() {
        if  (instance == null)
            instance = new JoinService(); // 필요할 때만 객체 생성

        return instance;
    }
}
