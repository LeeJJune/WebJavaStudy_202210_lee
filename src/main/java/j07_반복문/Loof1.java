package j07_반복문;

public class Loof1 {
    public static void main(String[] args) {

        int result =0;

        /*
        반복을 해라.
        i가 0부터 100 되기전까지 i를 1씩 증가시키면서 반복해라.
        */

        for(int i=0; i<100; i++) {
            result += i+1;
        }

        System.out.println("1~100까지 더한 값: "+result);

    }
}
