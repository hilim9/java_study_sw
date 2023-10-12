package exam05;

import java.util.List;

public class Juicier {

    // 메서드 중복정의
    // Basket<Apple> -> <> 문법적으로 맞지 않기 때문에 컴파일러가 삭제
    /*public static void make(Basket<Apple> basket) {
        List<Apple> items = basket.getItems();
        System.out.println(items);
    }

    public static void make(Basket<Melon> basket) {
        List<Melon> items = basket.getItems();
        System.out.println(itmes);

    */

    // 와일드 카드
    // Apple, Melon도 가능
    // 와일드 카드도 상한제한이 가능
    public static void make(Basket<? extends Fruit> basket) {
        List<?> items = basket.getItems();
        System.out.println(items);
    }
    
    // 위의 코드와 동일한 내용 extends 만 적용가능
    // 적용되는 내용이 많을 때 앞으로 떼서 정의 가능 <T extends Fruit>
    public static <T extends Fruit> void make3(Basket<T> basket) {
        
    }
    public static void make2(Basket<? super Apple> basket) { // Apple, Fruit, Object 가능
        List<?> items = basket.getItems();
        System.out.println(items);
    }


}
