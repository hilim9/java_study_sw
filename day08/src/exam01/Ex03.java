package exam01;

public class Ex03 {
    public static void main(String[] args) {

        // 자원 자동해제의 기준
        // -> AutoCloseable 인터페이스의 구현 클래스만 가능

        try(MyResource myResource = new MyResource()) {
            
            /*if(myResource instanceof  AutoCloseable) {
                
            }*/ // 내부적으로 instanceof 실행

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
