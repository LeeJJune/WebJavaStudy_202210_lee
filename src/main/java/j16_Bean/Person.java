package j16_Bean;

public class Person {

    private final String name;           // 멤버변수에 final을 선언하면 필수값이 된다.

    private int age;

    // public Person(){} <- NoArgsConstructor 상수이므로 반드시 값이 들어가야 되므로 null 은 사용 할 수 없다.



    public Person(String name) {        //<-- RequiredArgsConstructor
        this.name = name;
    }

    public Person(String name, int age) { //<-- AllArgsConstructor
        this.name = name;
        this.age = age;
    }
}
