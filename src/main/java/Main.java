import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args)  {
        Class<DemoClass> demoClassObj = DemoClass.class;
        DemoClass demoClass = new DemoClass();
        readAnnotationOnClass(demoClassObj, demoClass);
        Field[] fields = demoClassObj.getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
        }
        readAnnotationOnFields(fields, demoClass);
    }

    static void readAnnotationOnFields(Field[] fields, DemoClass demoClass) {
        try {
            Integer summary = 0;
            for (Field field : fields){
                Annotation[] annotations = field.getAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Sum) {
                        Integer value = (Integer) field.get(demoClass);
                        summary += value;
                    }
                }
            }
            System.out.println(summary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void readAnnotationOnClass(Class<DemoClass> demoClassObj, DemoClass demoClass) {
        try {
            Integer summary = 0;
            Field[] fields = demoClassObj.getDeclaredFields();
            for (Field field : fields){
                Integer value = (Integer) field.get(demoClass);
                summary += value;
            }
            System.out.println(summary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
