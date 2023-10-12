package exam03;

import exam05.Basket;
import exam05.Juicier;
import exam05.Melon;
import exam05.Toy;
import exam05.Apple;

public class Ex01 {
    public static void main(String[] args) {
        
        // < > -> 자료형 명시
        Basket<Apple> appleBasket= new Basket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());

        Juicier.make(appleBasket);

        Basket<Melon> melonBasket = new Basket<>();
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());

        Juicier.make(melonBasket);

        Basket<Toy> toyBasket = new Basket<>();
        toyBasket.add(new Toy());
        toyBasket.add(new Toy());

        //Juicier.make(toyBasket);



        
    }
}
