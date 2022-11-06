package j02_변수_상수;

public class Valiabl {
    public static void main(String[] args){

        // 논리자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        // 문자자료형 변수
        char name1 = '김';
        char name2 = '준';
        char name3 = '일';

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.print(""+name1+name2+name3);

        //문자열자료형 변수
        String name = "\n김준일";
        String name4 = "\n윤도영";
        String name5 = name + name4;
        System.out.println(name5);

        // 정수자료형
        int width=100;
        int width2=200;
        String width3="300";
        String width4="400";
        int widthResult = width+width2;
        String widthResult2 = width3+width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);


        //정수자료형 변수
        long time = System.currentTimeMillis();
        System.out.println(time);

        long time2 = 1666178955157L;
        System.out.println(time2);

        //실수자료형 변수
        double pi = 3.14159265351;
        System.out.println(pi);

        //상수자료형
        final String FILE_PATH = "C:/Users/lee";
  //    FILE_PATH = "D:/Users/aaa"; <- final 이라는 상수 명령어 때문에 에러남
        System.out.println(FILE_PATH);

        //형변환
    }
}
