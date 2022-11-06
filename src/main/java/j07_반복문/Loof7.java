package j07_반복문;

import java.util.Scanner;

public class Loof7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10 - i - 1; j++) {
                System.out.print(" ");
            }
                for(int j=0; j < i+1; j++){
                    System.out.print("*");
                }

                System.out.println();

            }
        for(int i =0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j < 10 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }

    }