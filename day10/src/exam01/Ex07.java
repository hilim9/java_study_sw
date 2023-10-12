package exam01;

public class Ex07 {
    public static void main(String[] args) {

        // indexOf( )
        String str = "Apple.Orange,Melon,Mango,Apple";
        int pos = str.indexOf("Apple");
        System.out.println(pos);

        // lastindexOf( )
        int pos2 = str.lastIndexOf("Apple");
        System.out.println(pos2);

        // replace( )
        // Apple을 PineApple로 치환
        str = str.replace("Apple", "PineApple");
        System.out.println(str);
    }
}
