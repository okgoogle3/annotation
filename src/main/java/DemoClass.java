@Sum
public class DemoClass {
    @Sum
    private Integer a = 10;
    @Sum
    private Integer b = 20;

}

/*public class SumAnalyzer {
    public void parse(Class<?> clazz)  {

        Method[] methods = clazz.getMethods();
        Field[] fields = clazz.getDeclaredFields();
        int sum = 0;

        for (Field field : fields) {
            if (field.isAnnotationPresent(Sum.class)) {
                try {
                    field.invoke(null);
                    pass++;
                } catch (Exception e) {
                    fail++;
                }
            }
        }


    }
}*/