package j15_Object클래스;

public class teachelEqual {
    public static void main(String[] args) {
        Tether tether1 = new Tether("김준일", "코리아시티");
        j15_Object클래스.Equals.Tether tether2 = new j15_Object클래스.Equals.Tether();

//        System.out.println(tether1 == tether2);

        System.out.println(tether1.equals(tether2));
        System.out.println(tether1.hashCode() == tether2.hashCode());


    }
}
