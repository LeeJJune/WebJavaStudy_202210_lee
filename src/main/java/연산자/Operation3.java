package 증감연산자;

  /* 윤년은 연도가 4의 배우시면서,
        100의 배수가 아닐 때 또는 400의 배수일 때이다.
  */

public class Operation3 {
    public static void main(String[] args){

        int year = 2024;
        boolean result = false;

        result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println("2000년은 윤달이다 => "+result);
    }
}
