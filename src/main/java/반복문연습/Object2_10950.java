package 반복문연습;

import java.util.Scanner;

public class Object2_10950{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.println("몇 개의 연산을 할지 숫자를 입력해주세요: ");
        a = scanner.nextInt();

        while (a != b) {

            System.out.println("A에 들어 갈 숫자를 입력하세요: ");
            int number1 = scanner.nextInt();
            System.out.println("B에 들어 갈 숫자를 입력하세요: ");
            int number2 = scanner.nextInt();

            if (number1 > 0 && number2 < 10 && a != b) {
                int number3 = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + number3 + "입니다");
                b++;

            } else if (number1 < 0 || number2 > 10 && a != b) {
                System.out.println("조건 값이 아닙니다");
                break;
            }
        }
        if(a == b){
            System.out.println("조건을 충족하여 종료 합니다");
        }

        }
    }







