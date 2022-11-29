package 컬렉션복습.컬렉션응용;

import java.util.*;

public class CollectionInput {

    public static void main(String[] args) {

        // 입력값으로 리스트 만들기

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("입력 할 숫자를 입력하세요: ");
        int inputName = scanner.nextInt();
        String jump = scanner.nextLine();


        System.out.println(inputName+"숫자 만큼 입력하세요: ");
        for (int i = 0; i < inputName; i++) {
            String name = scanner.nextLine();
            list.add(name);
        }
        System.out.println(list);

        // 입력한 값 조회 하기
        System.out.println("입력 조회값을 입력하세요: ");
        int searchId = scanner.nextInt();
        String searchIdName = list.get(searchId);
        System.out.println("조회 한 값은: "+searchIdName+"입니다");

    }
}
