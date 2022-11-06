package j09_클래스;

public class ContractorMain {
    public static void main(String[] args) {

        Contractor c1 = new Contractor();
        c1.showInfo();

        Contractor c2 = new Contractor(10);
        c2.showInfo();

        Contractor c3 = new Contractor(10, "김준일");
        c3.showInfo();
    }

}
