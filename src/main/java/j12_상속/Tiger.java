package j12_상속;

public class Tiger extends Animal {         //extends 클래스 확장시키는 명령어

    public Tiger(String name){
        super(name);    //부모의 주소를 가져옴   this 는 자기 자신의 주소를 가져옴
        System.out.println("Tiger 생성");
    }
    /*
        메소드 오버라이딩(오버라이드)
        [ 재정의 ]
        상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의 하는 행위
    ex)상속 관계에서 move 라는 동명의 메소드를 중복해서 쓸 수 있다
     */

    @Override
    public void move() {            // Ctrl + Space 누르면 자동완성 항목이 나온다
        super.move();               // public void move() 항목
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
