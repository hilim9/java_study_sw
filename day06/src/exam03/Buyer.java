package exam03;

public interface Buyer {

    // 판매자
    void buy();

    // 디폴트 메서드 - public 범위 (JDK 7이상)
    default void order() {

        System.out.println("Buyer 주문!");
        privateMethod();
    }

    // 정적 메서드
     public static void staticMethod() {

        System.out.println("정적 메서드!");
        privatesMethod();
     }

     // private 메서드
     private void privateMethod() { // (JDK 9이상)
         System.out.println("Private 메서드!");
     }

     private static void privatesMethod() {System.out.println("Private static 메서드!");}


}
