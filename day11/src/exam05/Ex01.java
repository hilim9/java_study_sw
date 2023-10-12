package exam05;

public class Ex01 {
    public static void main(String[] args) {
        
        // < > -> 자료형 명시
        Basket<Apple> appleBasket= new Basket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());

        Juicier.make2(appleBasket);

        /*Basket<Melon> melonBasket = new Basket<>();
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());

        Juicier.make2(melonBasket);*/

        Basket<Fruit> melonBasket = new Basket<>(); // 다형성
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());

        Juicier.make2(melonBasket);

        Basket<Toy> toyBasket = new Basket<>();
        toyBasket.add(new Toy());
        toyBasket.add(new Toy());

        //Juicier.make(toyBasket);



        
    }
}
