package 메소드;

import java.util.Scanner;

public class method2 {

        public static String getStar(int select, int n) {
            String result = "";

            if (select == 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
            }
            else if (select == 2) {
                for (int i = 0; i < n; i++) {

                    for(int j = 1; j < n - i; j++) {
                        result += " ";
                    }
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
            }
            else if (select == 3) {
                for (int i = 0; i < n; i++) {

                    for(int j = 0; j < n - i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
            }
            else if (select == 4) {
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j < i + 1; j++)
                     {
                        result += " ";
                    }
                    for(int j = 0; j < n - i; j++)
                     {
                        result += "*";
                    }
                    result += "\n";
                }
            }
            else {
                    System.out.println("입력 오류");
                }
                return result;

            }

        public static void main(String[] args) {
            // 입력
            Scanner scanner = new Scanner(System.in);

            System.out.print("별의 개수 입력: ");

            int n = scanner.nextInt();

            System.out.println("[메 뉴]");
            System.out.println("1. 왼쪽에 치우친 증가하는 별");
            System.out.println("2. 오른쪽에 치우친 증가하는 별");
            System.out.println("3. 왼쪽에 치우친 감소하는 별");
            System.out.println("4. 오른쪽에 치우친 감소하는 별");
            System.out.println("메뉴를 선택하세요: ");


            int select = scanner.nextInt();

            if (select == 1) {
                System.out.println("1. 왼쪽에 치우친 증가하는 별을 선택하셧습니다");
                }

            else if (select == 2) {
                System.out.println("2. 오른쪽에 치우친 증가하는 별을 선택하셧습니다");
                }

             else if (select == 3) {
                System.out.println("3. 왼쪽에 치우친 감소하는 별을 선택하셧습니다");
            }
             else if (select == 4) {
                    System.out.println("4. 오른쪽에 치우친 감소하는 별을 선택하셧습니다");
                }
             else {
                System.out.println("입력 오류입니다 다시 선택하세요. ");
            }


            System.out.println("[결과]");
            String star = getStar(select, n);
            System.out.println(star);


            }


        }


