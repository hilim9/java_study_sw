package exam01;

public class Ex01 {
    public static void main(String[] args) {

        int result1 = add(10,20);
        System.out.println(result1);

        int result2 = add(20, 30);
        System.out.println(result2);
    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;

        return result;
    }

    /*public void add(int num1, int num2) {

        System.out.println(num1 + num2);

    }*/
}
