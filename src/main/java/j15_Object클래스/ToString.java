package j15_Object클래스;

public class ToString {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("김준일","부산");

        System.out.println(objectTest);
        System.out.println(objectTest.toString());

        Tether tether1 = new Tether("김준일","코리아아이티");
        Tether tether2 = new Tether("김준일","코리아아이티");

        System.out.println(tether1);
        System.out.println(tether2);

//        String str = objectTest.toString(); // objectTest 단일 사용 불가능
//        System.out.println(str);

    }
}
