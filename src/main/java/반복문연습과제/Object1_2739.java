package 반복문연습과제;

public class Object1_2739 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 10;

        for(int i=0; i<b; i++){
            a += i+1;
//            System.out.println(i);
            for(int j=1; j<b; j++) {
                int c = i * j;
                System.out.println(i + " X " + j+" = "+c);
            }
        }



    }
}
