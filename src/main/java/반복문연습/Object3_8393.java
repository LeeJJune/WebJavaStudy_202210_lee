package 반복문연습;

import java.util.Scanner;

public class Object3_8393 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a=0;
        int b=0;
        b = scanner.nextInt();

        for(int i=0; i<=b; i++){
            a+=i;
            System.out.println(a);
        }

    }
}
