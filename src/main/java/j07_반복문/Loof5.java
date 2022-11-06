package j07_반복문;

import java.util.Scanner;

public class Loof5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 5;

        for(int i = 0; i < n; i++) {
            System.out.println(i+1);
        }
        int i=0;

        while (i > n) {

            System.out.println(i+1);
            i++;
        }

        }
    }