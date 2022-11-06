package j14_참조자료형캐스팅.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal animal1 = null;
        Animal animal2 = null;

        System.out.println("[캐스팅 전]");
        human.move();
        human.redBooks();

        tiger.move();
        tiger.hunting();

        System.out.println("[캐스팅 후]");
        System.out.println("<업캐스팅>");
        animal1 = human;
        animal2 = tiger;
        animal1.move();
        animal2.move();

        System.out.println("[캐스팅 후]");
        System.out.println("<다운캐스팅>");
        Human d_human = (Human) animal1;
        Tiger d_tiger = (Tiger) animal2;
        d_human.redBooks();
        d_tiger.hunting();

        System.out.println("==============================");
        System.out.println(" ");

//        Animal a = new Animal();
//        Animal h = (Human) a;
//        h.move();


    }
}
