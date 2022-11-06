package j08_메소드;

// 메소드 오버로딩
// 동명의 함수명은 사용 할 수 없다
// 매개변수의 형태가 다르면 동일한 함수명을 사용 할 수 있다.

public class method3 {

    public static void add() {
        System.out.println("add()");
    }

    public static void add(int a){
        System.out.println("add(int a)");
    }
    public static void add(String a){
        System.out.println("add(String a)");
    }
    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
    }
    public static void add(int a, String b){
        System.out.println("add(int a, String b)");
    }
    public static void add(String a, int b){
        System.out.println("add(String a, int b)");
    }
    public static void add(String a, String b){
        System.out.println("add(String a, String b)");
    }


    public static void main(String[] args) {

        add();
        add(10);
        add("10");
        add(10, 10);
        add(10, "10");
        add("10", 10);
        add("10","10");

    }

}





