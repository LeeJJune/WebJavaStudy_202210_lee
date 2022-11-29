package Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        /**
         * 문자열 입력
         * next() 띄워쓰기 포함 x (부산 광역시 2개 입력 받음)
         * nextline() 띄워쓰기 포함 o (부산 광역시 1개 입력 받음)
         */

        String name = "김준일";

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();


        System.out.println("입력받은값: "+s);
        System.out.println("입력받은값2: "+s2);
        System.out.println("입력받은값3: "+s3);

    }
}
