package Scanner;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("X 입력 ");
        int x = scanner.nextInt();
        System.out.print("Y 입력 ");
        int y = scanner.nextInt();

        System.out.println("X+Y = "+(x+y));



    }
}
