package sk.jaro.anotacie;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String[] name();
    String date();
    String company() default "PosAm";
    int vek();
}
