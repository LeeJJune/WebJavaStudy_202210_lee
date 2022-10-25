package 조건문연습과제;

import java.util.Scanner;

public class object1_2884 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h =0;
        int m =0;
        int hLow = 0;

        System.out.println("시간을 설정해주세요: ");
        h=scanner.nextInt();
        System.out.println("분을 설정해주세요: ");
        m=scanner.nextInt();

        if(h <= 23 && m >= 45){
            m = m - 45;
            System.out.println("설정된 알람시간은 "+h+"시"+m+"분");

        }
        else if (h <= 23 && m <= 44) {
            hLow = m - 45;
            hLow = -60 - hLow;
            h = h-1;
            System.out.println("설정된 알람시간은 "+h+"시"+hLow*-1+"분");
        }
        else if (h == 0 && m >= 45){
            h = 23;
            m = m - 45;
            System.out.println("설정된 알람시간은 "+h+"시"+m+"분");

        } else if (h == 0 && m <= 44) {
            hLow = m - 45;
            hLow = -60 - hLow;
            h = 23;
            System.out.println("설정된 알람시간은 "+h+"시"+hLow*-1+"분");
        }
        else{
            System.out.println("존재 하지 않는 시간/분 입니다");
        }

    }
}
