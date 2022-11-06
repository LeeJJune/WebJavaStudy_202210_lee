package j10_접근지정자;

public class Class01Main {
    public static void main(String[] args) {

        Class01 sam = new Class01(20220001, "김준일");

        sam.showInfo();
        sam.setName("김준이");
        sam.showInfo();

        System.out.println(sam.getCode());
    }
}
