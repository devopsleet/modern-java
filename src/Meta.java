import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Myanno {
    String str();
    int val();
}

public class Meta {

    @Myanno(str= "This is my First Java annotations Program", val = 100)
    static void myMeth() {

        Meta ob = new Meta();

        try {
            Class <?> cls = ob.getClass();
            Method m = cls.getDeclaredMethod("myMeth");

            Myanno anno = m.getAnnotation(Myanno.class);

            System.out.println(anno.str());


        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        myMeth();

    }
}
