package j13_추상화.추상클래스;

public class Main {
    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory("애플 스마트 공장");
        TabletFactory tabletFactory = new TabletFactory("애플 테블릿 공장");

        phoneFactory.produce("아이폰 14");
        tabletFactory.produce("아이패드 프로4");

//      Factory factory = new Factory();

        phoneFactory.printInfo();
        tabletFactory.printInfo();

    }
}
