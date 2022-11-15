package j25_문자열;

// equalsIgnoreCase : 대소문자 구분없이 조건을 검색하다
// isBlank : 문자열 빈공간 확인(11버전 부터 사용 가능)
// isEmpty : 빈공간을 확인하지만 공백은 체크 하지 않는다

public class String6 {
    public static void main(String[] args) {

        String httpMethod = "/user/1";
        /*
        * 문자열이 비어있지 않으면
        * 1. null 이 아니면
        * 2. 빈값("")이 아니면
        * 3. " "(스페이스(공백))이 아니면
        * */

        if(!httpMethod.isBlank()){
            System.out.println(httpMethod);
        } else {
            System.out.println("공백을 사용할 수 없습니다");
        }
    }
}
