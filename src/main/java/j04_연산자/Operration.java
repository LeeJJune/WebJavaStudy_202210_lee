package 증감연산자;

public class Operration {
    public  static void main(String[] args){
        int num=10;
        num = num+1;

        // 증감연산자
        System.out.println(num);
        System.out.println(++num); // 선증감
        System.out.println(num++); // 후증감
        System.out.println(num);
        System.out.println("\n");


        // 감소연산자
        num = 10;                  // 10으로 초기화

        System.out.println(num);
        System.out.println(--num); // 선감소
        System.out.println(num--); // 후감소
        System.out.println(num);

    }
}
