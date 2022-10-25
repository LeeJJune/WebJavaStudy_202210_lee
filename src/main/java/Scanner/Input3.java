package Scanner;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        /*
        이름: 김준일                // name
        나이: 29                   // age
        주소: 부산 동래구 사직동      // adess
        연락처: 010 9988 1916      // phone

        // 출력 결과
        사용자의 이름은 김준일이고 나이는 29입니다.
        주소는 부산 동래구 사직동이며 연락처는 010 9988 1916 입니다
         */
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String adress = null;
        String phone = null;

        System.out.print("이름: ");
        name = scanner.next();

        System.out.print("나이: ");
        age = scanner.nextInt();


        adress = scanner.nextLine();
        // age 에서 사용된 nextInt 는 엔터를 포함한 값이 남아 있으므로 초기화 해줘야 한다
        System.out.print("주소: ");
        adress = scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.print("사용자의 이름은 "+name+"이고 나이는"+age+"입니다 \n");
        System.out.print("주소는 "+adress+"이며 연락처는 "+phone+"입니다");
    }
}
