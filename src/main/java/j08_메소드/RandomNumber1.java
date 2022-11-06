package j08_메소드;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber1 {
    public static int calcRandom(int m) {
            // 위에 선언된 int 를 돌려준다 리턴자료형
        Random random = new Random();

        int result = random.nextInt(10) * 1000 + m;

        return result;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        int a = 0;
//        a = scanner.nextInt();

        int money = 5000;
        /*
        int a = random.nextInt(10)*1000+money;
        int b = random.nextInt(10)*1000+money;
        int c = random.nextInt(10)*1000+money;
        int d = random.nextInt(10)*1000+money;*/



    /*    for(int i = 0; i < 5; i++) {
        int ranNum = random.nextInt((100)+100);
        System.out.println(ranNum);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a+b+c+d);
        }
        */

//        System.out.println(calcRandom(money));
//        System.out.println(calcRandom(money));
//        System.out.println(calcRandom(money));
//        System.out.println(calcRandom(money));
//        System.out.println(calcRandom(money));

        int r = calcRandom(money);



        System.out.println(r + 100);
        System.out.println(r + 1000);
        System.out.println(r + 10000);
        System.out.println(r + 100000);
    }
}
