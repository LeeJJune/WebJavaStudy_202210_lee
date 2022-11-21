package 조건문연습;

import java.util.Random;

public class object2_2480 {
        public static void main(String[] args) {

        Random random = new Random();

            int dice1 =0;
            int dice2 =0;
            int dice3 =0;

            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            dice3 = (int)(Math.random()*6)+1;

            System.out.println(dice1);
            System.out.println(dice2);
            System.out.println(dice3);


                if (dice1 == dice2 && dice1 == dice3 && dice2 == dice3) {
                    int total1 = 1000 * dice1 + 10000;
                    System.out.println("상금은" + total1 + "입니다");

                } else if (dice1 == dice2) {

                    int total2 = 100 * dice1 + 1000;
                    System.out.println("상금은" + total2 + "원 입니다");

                } else if (dice1 == dice3) {
                    int total3 = 100 * dice1 + 1000;
                    System.out.println("상금은" + total3 + "원 입니다");

                } else if (dice2 == dice3) {
                    int total4 = 100 * dice2 + 1000;
                    System.out.println("상금은" + total4 + "원 입니다");

                } else {
                    System.out.print("상금은"+(Math.max(Math.max(dice1, dice2), dice3)*100)+"원 입니다");
                }
        }
    }

