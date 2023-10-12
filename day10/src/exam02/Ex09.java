package exam02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("두 수를 입력하세요: ");
            String line = sc.nextLine();
            if(line.equals("q")) break;
            String[] lines = line.split("\\s+"); //  정규표현식 -> \\s: 공백 +: 한 개 이상의 공백
            System.out.printf("두 수의 합: %d%n",Integer.parseInt(lines[0]) + Integer.parseInt(lines[1]));
        }
    }
}
