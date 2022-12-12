package WebJavaStudy_202210_lee.src.main.java.j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for (String name : list){
//            System.out.println(name);
        }

        list.forEach(name -> {
            System.out.println(name);
        });

        /* 위 내용(forEach)을 풀은 것이 주석문 내용 (컨트롤로 명령어 찾아가보면 Acc 알 수 있음)
        Consumer<String> consumer = name -> {
            System.out.println(name);
        };
        for(String name : Objects.requireNonNull(list)){
            consumer.accept(name);
        }
        */

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < 10; i++){
            numbers.add(i+1);
            System.out.println(i);
        }
        AtomicInteger result = new AtomicInteger();

        numbers.forEach(num -> {
            result.addAndGet(num);
        });
        System.out.println(result.get());

        // TreeMap 순차 정렬 HashMap 무작위 정렬
        Map<Integer, String> students = new TreeMap<Integer, String>();
        for(int i = 0; i < 10; i++) {
            students.put(20220001+i, "김준"+(i+1));
        }
        students.forEach((key, value) ->{
            System.out.println("학번: "+key+",이름: "+value);
        });
    }
}