package exam04;

import exam03.Fruit;

public class Box <T extends Fruit & Eatable> { // Fruit, Apple, Melon
    // Fruit의 하위클래스만 가능하도록 T(타입 매개변수)를 제한(상한제한)
    // 상한제한 했기 때문에 Object가 아닌 Fruit로 형변환된다

    // 지네릭의 두가지 목적
    // 형변환의 번거로움을 없앰
    // 타입 안정성 확보
    private T item;

    // private static T item2; -> static은 사용 불가능
    // private T[] item3 = new T[]; -> new 연산자로 생성, 배열공간 생성 불가능
    // -> T로 자료형이 명시 되어 있지 않아서 얼만큼 공간을 할당 받아야하는지 모르기 때문에 불가능
    // 컴파일러가 T 제거

    // int로 명시해 줄경우 가능
    private int[] item3 = {1, 2, 3};
    private int[] item4 = new int[3];

    public void setItem(T item) {
        this.item = item;

    }

    public T getItem() {
        return item;
    }

    public void printInfo() {

        // item.getInfo();
        System.out.println(item.getInfo());

    }

    public <T,U> void method(T t, U u) { // public <T> <- 지네릭 메서드 (호출되서 실행될때 결정)
                                        // 지네릭 클래스에 있는 T와는 다르다

    }

}
