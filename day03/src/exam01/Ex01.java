package exam01;

public class Ex01 {
    public static void main(String[] args) {

        /*int studentId1 = 20231401;
        int studentId2 = 20231401;
        ....
        int studentId50 = 20231401;*/

        int[] studentIds = new int[50]; // int studentId1 ...

        for (int i = 0; i < 50; i++) {

            studentIds[i] = i + 20231401;
        }

    }
}
