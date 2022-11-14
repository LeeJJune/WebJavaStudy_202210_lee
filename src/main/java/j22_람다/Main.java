package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        //Runnable 사용법

        Runnable runnable1 = () -> {
            System.out.println("첫번째 프로그램을 실행 합니다");

        };
        Runnable runnable2 = () -> {
            System.out.println("두번째 프로그램을 실행 합니다");
        };

        runnable1.run();
        runnable2.run();

        //쓰레드는 동시 동작이 가능하다(그래서 반복문이 동시에 돌아간다)
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                    System.out.println("쓰레드1: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                    System.out.println("쓰레드2: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        // 아래 시뮬레이터 때문에 주석 처리함
//        thread.start();
//        thread2.start();


        // Supplier 사용법
        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());

        // Consumer 사용법 // 매개변수가 1개 일때"만" 사용 사능
        Consumer<String> consumer = (name) -> {
            System.out.println("이름: " + name);
        };
        consumer.accept("김준일");

        // Function 사용법
        Function<Integer, String> function = age -> "나이: "+age;
        System.out.println(function.apply(29));

        // Predicate 사용법
        Predicate<Integer> leapMouth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 ==0;
        System.out.println(leapMouth.test(2001));
    }
}