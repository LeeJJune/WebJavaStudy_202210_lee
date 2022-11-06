package j09_클래스;

public class Contractor {

    int num;
    String name;

    Contractor(){
        System.out.println("NoArgsContractor(기본생성자)");
    }
    Contractor(int num){
        System.out.println("RequiredContractor(int 매개변수를 필수로 하는 생성자)");
        this.num = num;
        // 전역변수와 지역변수 구분 하기 위한 사용법 "this"
    }
    Contractor(String name){
        System.out.println("RequiredContractor(String 매개변수를 필수로 하는 생성자)");
        this.name = name;
    }
    Contractor(int num, String name){
        System.out.println("AllArgsContractor(전체 생성자)");
        this.num = num;
        this.name = name;
    }
    void showInfo(){
        System.out.println("num: "+num);
        System.out.println("name: "+name);
    }
}
