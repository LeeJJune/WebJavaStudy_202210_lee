/*
* Checked Exception : 개발자가 직접 수정(오타 및 잘못된 코드)해야 될 경우 <- 컴파일 전 발생하는 문제
* Unchecked Exception : 컴파일 완료 후 개발자가 건들이지 않아도 예외 발생 처리 하는 경우
* */

/* Try 인터페이스
* ArithmeticException :	정수를 0으로 나눌경우 발생
* ArrayIndexOutOfBoundsException :	배열의 범위를 벗어난 index 를 접근할 시 발생
* ClassCastException :	변환할 수 없는 타입으로 객체를 반환 시 발생
* NullPointException :	 존재하지 않는 레퍼런스를 참조할때 발생
* IllegalArgumentException :	잘못된 인자를 전달 할 때 발생
* IOException :	입출력 동작 실패 또는 인터럽트 시 발생
* OutOfMemoryException : 	메모리가 부족한 경우 발생
* NumberFormatException :	문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생
 * */

package j23_예외;

public class Exception1 {

    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7};

        try{
            String a = null;
            a.toLowerCase();

            for (int i = 0; i < 8; i++) {
                System.out.println(numbers[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("예외를 처리 하였습니다.");
        }catch (NullPointerException e){
            System.out.println("null pointer to exception");
        }finally {
            System.out.println("항상 실행되어야 하는 서비스");
        }
        System.out.println("프로그램 정상 종료");
    }
}
