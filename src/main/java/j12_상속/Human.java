package j12_상속;

public class Human extends Animal {         //extends 클래스 확장시키는 명령어
    public Human(String name){
        super(name);    //부모의 주소를 가져옴   this 는 자기 자신의 주소를 가져옴
        System.out.println("Human 생성");
    }
    /*
        메소드 오버라이딩(오버라이드)
        [ 재정의 ]
        상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의 하는 행위
    ex)상속 관계에서 move 라는 동명의 메소드를 중복해서 쓸 수 있다
     */
    @Override   // @: [어노테이션]
                // @Override 해당 메소드가 상위 객체로부터 재정의된 메소드입니다를 "표기" 한다 특별한 기능은 없음
    public void move(){
//        move();       //이렇게 사용하면 자기자신의 move 를 호출해서 무한반복이 사용됨
        super.move();
        System.out.println("두 발로 걷습니다");
    }

}
