package 반복문연습;

import java.util.Scanner;

public class Object8_2438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        String star = "";
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                star += "*";

            }
            star += "\n";

            }
        System.out.println(star);
        }

    }





