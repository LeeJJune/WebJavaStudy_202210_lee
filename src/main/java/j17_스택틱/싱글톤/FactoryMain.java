package j17_스택틱.싱글톤;

public class FactoryMain {
    public static void main(String[] args) {

        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        Smartphone smartphone1 = factory1.produceSmartPhone();
        Smartphone smartphone2 = factory2.produceSmartPhone();
        Smartphone smartphone3 = factory3.produceSmartPhone();
        Smartphone smartphone4 = factory4.produceSmartPhone();

        System.out.println(smartphone1);
        System.out.println(smartphone2);
        System.out.println(smartphone3);
        System.out.println(smartphone4);

    }
}
