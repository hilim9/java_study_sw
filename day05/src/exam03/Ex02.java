package exam03;

public class Ex02 {
    public static void main(String[] args) {
        
        // 다형성

        /* Human[] animals = new Human[3];
        animals[0] = new Human();
        animals[1] = new Bird();
        animals[2] = new Tiger(); */
        
        // 상위 클래스인 Animal을 이용하면 가능
        Animal[] animals = new Animal[3];
        animals[0] = new Human(); // Animal animals[0] = new Human();
        animals[1] = new Bird();  // Animal animals[1] = new Bird();
        animals[2] = new Tiger();  // Animal animals[2] = new Tiger();

        for (Animal animal : animals) {
            animal.move();
            if (animal instanceof Human){
                Human human = (Human) animal;
                human.reading();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }

        }

    }
}
