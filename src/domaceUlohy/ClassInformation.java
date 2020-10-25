package domaceUlohy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassInformation {
    String author();
    String date();
    int currentRevision();
    String lastModified();
    String lastModifiedBy();
    String [] reviewers();
}
