package exam02;

public class Ex01 {
    public static void main(String[] args) {

        Box applebox = new Box();
        applebox.setItem(new Apple()); // Object item = new Apple(); 다형성
        Apple apple = (Apple)applebox.getItem();

        Box Melonbox = new Box();
        Melonbox.setItem(new Melon()); // Object item = new Melon(); 다형성
        // Apple melon = (Apple)Melonbox.getItem(); // ClassCastException 타입 안정성이 떨어짐
        // Melon melon = (Melon)Melonbox.getItem();
        
        // 지네릭의 두가지 목적
        // 형변환의 번거로움을 없앰
        // 타입 안정성 확보
        Object obj = Melonbox.getItem();
        if (obj instanceof Apple) { 
            Apple melon = (Apple) obj;
        }



    }
}
