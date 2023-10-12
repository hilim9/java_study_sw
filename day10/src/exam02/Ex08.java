package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("두 수를 입력 하세요 (예: 100 200) :");
            String line = br.readLine();
            if (line.equals("q")) break;

            String[] lines = line.split("\\s+");// 정규표현식 -> \\s: 공백 +: 한 개 이상의 공백
            int num1 = Integer.parseInt(lines[0]);
            int num2 = Integer.parseInt(lines[1]);
            System.out.printf("두 수의 합: %d", num1 + num2);
        }
    }
}


