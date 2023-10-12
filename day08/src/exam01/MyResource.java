package exam01;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception { //  close() 메서드를 자동 호출
        System.out.println("자원해제!!");
    }
}
