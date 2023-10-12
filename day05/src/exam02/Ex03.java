package exam02;

public class Ex03 {
    public static void main(String[] args) {
        
        A ac = new C();
        A ad = new D();
        System.out.println(System.identityHashCode(ac));

        // C c1 = (C)ad; -> 명시적 형변환
        //C c1 = (C)ad; // java.lang.ClassCastException 오류발생


        /* C -> B -> A (C안에 B, A 상속받음)
           D -> A	 (D안에 A상속)
           위 처럼 상속 되었을 경우
        */

        if (ad instanceof C) {
            C c1 = (C)ad; // 명시적 형변환을 했지만 D객체를 담고있는 ad는 C와 관련이 없기 때문에 실행되지 않음

        }

        if (ac instanceof C) {
            C c2 = (C)ac; // A에 담겨있는 ac를 C로 형변환
            System.out.printf("numA=%d, numB=%d, numC=%d%n",c2.numA, c2.numB,c2.numC);

            System.out.println(System.identityHashCode(c2));

            B b1 = (B)ac; // A에 담겨있는 ac를 B로 형변환
            System.out.printf("numA=%d, numB=%d, numC=%d%n",c2.numA, c2.numB,c2.numC);

            System.out.println(System.identityHashCode(b1));
        }





    }
}
