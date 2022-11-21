package 리스트연습;

import java.util.*;

public class AnimalMain {
    public static void main(String[] args) {

    List<Integer> codeList = new ArrayList<Integer>();
    List<String> nameList = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);

    int index = 0;
    String index2= null;


    System.out.println("몇 명을 입력 하시나요");
    index = scanner.nextInt();

    System.out.println("code 를 입력하세요");
    for(int i = 0; i <= index; i++) {
        i = scanner.nextInt();
        codeList.add(i);
    }
    System.out.println("name 을 입력하세요");

    for(int i = 0; i <= index; i++) {
            index2 = scanner.nextLine();
            nameList.add(index2);
        }

        nameList.remove(0);

        System.out.println(codeList);
        System.out.println(nameList);

        for(int i = 0; i <= index; i++) {
//        Animal animal = new Animal(codeList.get(i), nameList.get(i));
        }


    }
}
