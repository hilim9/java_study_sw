package exam03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex02 {
    public static void main(String[] args) {

        // Class 객체
        // class 정보가 담겨있는 객체
        Class cls = Book.class;


        System.out.println("------ Fields --------");
        Field[] fields = cls.getFields(); // ALT + ENTER import
        for (Field field : fields) {
            System.out.println(field);
        }
        // title, author, publisher
        // private을 설정 되어 있기 때문에 보이지 않음

        // public만 보임
        System.out.println("------ Methods --------");
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("-------- Constructors -------");
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
