package 조건문;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;               // 시험점수
        String grade = null;         // 학점(등급)

        System.out.println("점수를 입력하세요: ");

        score = scanner.nextInt();


        if (score < 0 || score > 100) {
            grade = "X";
        }
        else if (score > 89) {
            grade = "A";
        }
        else if (score > 79) {
            grade = "B";
        }
        else if (score > 69) {
            grade = "C";
        }
        else if (score > 59) {
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("입력한 점수는"+score+"이며, 학점은"+grade+"입니다");

    }
}
       //수업중과제 - 조건
        /**
         * score가 0보다 작거나 100보다 크면 grade = X 값 출력
         * 90~100점 사이면 grade = A
         * 80~89점 사이면 grade = B
         * 70~79점 사이면 grade = C
         * 60~69점 사이면 grade = D
         * 0~59점 사이면 grade = F
         *
         * 마지막 출력문구 - 입력한 점수는 __이며, 학점은 __학점입니다
          */
