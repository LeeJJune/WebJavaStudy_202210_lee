package 반복문;

import java.util.Scanner;

public class Loof6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isEmpty = true;

        while (isEmpty){
            System.out.println("숫자를 입력하세요: ");
            int num = scanner.nextInt();

            if(num !=0){
                isEmpty =false;
            }

        }

        }
    }