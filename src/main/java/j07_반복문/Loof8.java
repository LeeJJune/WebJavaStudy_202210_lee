package j07_반복문;

import java.util.Scanner;

public class Loof8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        i = scanner.nextInt();
        System.out.println("첫번째 입력");

        while (true) {
            if (i > 9) {
                break;
            }
            System.out.println(i);
            i++;

        }
        int a = 0;
        a = scanner.nextInt();
        System.out.println("특정 숫자를 만나면 종료 됩니다");
        System.out.println("두번째 입력");
        for(int j=0; j < a; j++){
            if( j == 7){
                System.out.println("7을 만났습니다");
                break;
            }
            System.out.println(j);
        }
    System.out.println("<<<<<<<<<<<Continue >>>>>>>>>>>>>>>>>>");
        for( int j=0; j < 100; j++){
            if(j % 5 !=0 || j == 0){
                continue;
            }
            System.out.println(j);
        }
    }


}