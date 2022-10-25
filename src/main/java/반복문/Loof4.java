package 반복문;

import java.util.Scanner;

public class Loof4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dan = 0;

//        System.out.println("단 입력");
//        dan = scanner.nextInt();
        for (int i = 0; i < 8; i++) {
            dan = i + 2;

            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + "x" + num + "=" + (dan * num));
            }
        }
    }
    }