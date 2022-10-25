package 반복문;

import java.util.Scanner;

public class Loof3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;


        System.out.println("몇번 반복할지 입력하세요");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }
            for (int i = 0; i < n; i++) {
                System.out.println(n -= 1);
            }

        }
    }
