package j22_람다;

// 람다식 함수는 메소드를 1개만 가질 수 있다

public class OperationMain {
    public static void main(String[] args) {

        int a= 10, b = 20;
            // 주석문은 클래스 선언 후 사용 방법
            // 주석 안된 것은 람다식 사용 방법

//        Operation add = new Operation(){
//            @Override
//            public int calc(int x, int y) {
//                return x + y;
//            }
//        };
        Operation add2 = (x, y) -> {
            return x + y;
        };
//        Operation sub = (int x, int y) -> {
//          return x - y;
//        };
        // 위 람다식 한 줄로 줄이기
        Operation sub = (x, y) -> x - y;
        System.out.println(sub.printResult(sub.calc(b, a)));


//        int addResult = add.calc(a, b);
//        System.out.println(a+" + "+b+"= "+addResult);

        int addResult2 = add2.calc(a, b);
        System.out.println(a+" + "+b+"= "+addResult2);
        System.out.println(sub.calc(b, a));

        // 람다식 곱하기
        Operation multi = (x, y) -> x * y;
        System.out.println(sub.printResult(multi.calc(b, a)));

        // 람다식 나누기
        Operation div = (x, y) -> x / y;
        System.out.println(sub.printResult(div.calc(b, a)));
    }
}