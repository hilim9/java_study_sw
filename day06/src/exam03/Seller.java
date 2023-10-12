package exam03;

public interface Seller {

    // 구매자
    void sell();

    default void order() {
        System.out.println("Seller 주문!");
    }
}
