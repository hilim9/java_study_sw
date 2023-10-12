package exam01;

public class Ex05 {
    public static void main(String[] args) {

        // long L을 명시해 주어야한다
        long num = 10000000000L;  // int -> long

        byte num2 = 100; // int 100 -> byte 100
        int num3 = 100; // 효율적

        double num4 = 100.12345555;
        float num5 = 100.12345555f; // double(8) 100.1234 -> float(4)

        System.out.println(num4);
        System.out.println(num5);

        long num6 = 1_000_000_000_000_000_000L;

        System.out.println(num6);

        System.out.println(System.identityHashCode(num));
    }
}
