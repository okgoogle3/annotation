@Sum
public class DemoClass {
    @Sum
    Integer a = 10;
    @Sum
    Integer b = 20;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
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