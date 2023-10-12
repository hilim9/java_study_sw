package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args) throws IOException {

        // 한글은 깨짐
        System.out.println("아무 문자 입력 : ");
        /*char ch = (char)System.in.read();
        System.out.println(ch);*/

        // 바이트 단위 입력 스트림 -> 문자 단위 스트림(Reader)으로 변환
        // 변환 메서드
        /*InputStreamReader isr = new InputStreamReader(System.in);
        char ch = (char)isr.read();
        System.out.println(ch);*/

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        System.out.println(line);
    }
}
