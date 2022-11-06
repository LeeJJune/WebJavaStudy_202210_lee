package j11_배열;

import java.util.Scanner;

/**
 * 1. 10명의 학생이름을 담을 수 있는 studentName 배열을 만든다.
 * [출력결과] 1.정빈 2.김규민 3.박경효 4.김혜진 5.김지향 6.전병욱 7.윤도영 8.이성욱 9.홍성욱 10.박민화
 *
 *
 * */

public class ArrayTest2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] studentName = new String[10];

        int i = 1;
        int count = 0;

        System.out.println("몇명의 학생을 등록 하시겠습니까?");
        count = scanner.nextInt();

        while (count < 9 && i < count) {
            System.out.println(i+"번째 학생 이름을 입력하세요");
            studentName[i] = scanner.nextLine();
            i++;
            if (i >= count) {
                for (int j = 0; j < count; j++) {
                    System.out.println(studentName[j]);
                }

            }
            }

        }

    }

