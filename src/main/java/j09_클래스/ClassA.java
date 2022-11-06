package j09_클래스;
//Class 는 앞자리가 대문자로 시작 되어야 한다.
public class ClassA {
    
        int num;
        String name;
        double score;

        //생성자는 주소값을 항상 반환한다 반환자료형이라고 한다
    ClassA(){

    }

    ClassA(int a){
            System.out.println("a: "+a);
            System.out.println("ClassA를 생성합니다");
        }

        void callName(){
            System.out.println(name+" "+num+"을(를) 부릅니다");
        }

    }

