package exam01;

public class Ex04 {
    public static void main(String[] args) {

        LoginService l1 = LoginService.getInstance();
        LoginService l2 = LoginService.getInstance();

        System.out.println(l1 == l2);

        System.out.println(System.identityHashCode(l1));
        System.out.println(System.identityHashCode(l2));
    }
}
