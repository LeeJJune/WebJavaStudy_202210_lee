package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {
        Tether tether1 = new Tether("김준일", "코리아아이티");
        Tether tether2 = new Tether("김준일", "코리아아이티");

        Class t_class = tether1.getClass();

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());


        Field[] fields = t_class.getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }
        Method[] methods = t_class.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getReturnType());
        }
        System.out.println(tether1.getClass() == tether2.getClass());
        System.out.println(tether1 instanceof Tether);
        System.out.println(tether1.getClass() == Tether.class);
        System.out.println(tether2.getClass() == Tether.class);
    }
}
