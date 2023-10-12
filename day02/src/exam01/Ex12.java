package exam01;

public class Ex12 {
    public static void main(String[] args) {
        
        // 선택문
        // switch-case문은 정수만 가능 (JDK1.7부터는 문자열 가능)
        int rank = 4;

        switch (rank) {
            case 1:
                System.out.println("금메달!");
                break;
            case 2:
                System.out.println("은메달!");
                break;
            case 3:
                System.out.println("동메달!");
                break;
            default:
                System.out.println("입상!");
                break;
        }

        // JDK1.7부터는 문자열 가능
        String str = "gold";
        switch (str) {
            case "gold":
                System.out.println("금메달!");
                break;
            case "silver":
                System.out.println("은메달!");
                break;
            case "bronze":
                System.out.println("동메달!");
                break;
            default:
                System.out.println("입상!");
                break;
        }
    }
}
