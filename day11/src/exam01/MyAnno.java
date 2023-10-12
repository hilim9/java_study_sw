package exam01;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.*;

@Target({TYPE, METHOD, FIELD}) // 속성만 설정하는 경우는 value= 생략
// import static java.lang.annotation.ElementType.*; ElementType생략
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno { // java.lang.annotation.Annotation 상속

    //String value();
    String[] value();

    int max() default 200; // 입력하지 않으면 기본값 설정됨

    int min() default 20; // 입력하지 않으면 기본값 설정됨
}
