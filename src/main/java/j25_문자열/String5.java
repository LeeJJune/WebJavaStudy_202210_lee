package j25_문자열;

// equalsIgnoreCase : 대소문자 구분없이 조건을 검색하다

public class String5 {
    public static void main(String[] args) {

        String httpMethod = "Get";


        if(httpMethod.equalsIgnoreCase("gET")) {
            System.out.println("get 을 요청합니다.");
        } else {
            System.out.println("get 요청이 아닙니다.");
        }

    }
}
