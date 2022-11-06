package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        String name1 = "김준일";
        String name2 = "김준일";
        String name3 = new String("김준일");
        String name4 = new String("김준일");

        System.out.println(name1 + ", " + name2);

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name3 == name4);
        System.out.println(name1.equals(name3));

        // == 주소비교 equals 는 주소 안 값 비교


    }

}
