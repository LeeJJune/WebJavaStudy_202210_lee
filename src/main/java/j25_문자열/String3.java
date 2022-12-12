package Variable.src.main.java.j25_문자열;

public class String3 {
    public static void main(String[] args) {

        /* replaceAll 활용법 */

        String phoneNumber = "010-9988-1916";

        // replaceAll 은 String 으로 반환 하기에 .replaceAll 붙여서 사용 가능
        String replacePhoneNumber =
                phoneNumber.replaceAll("-", "")
                        .replaceAll("/", "")
                        .replaceAll("_", "")
                        .replaceAll(" ","");

        System.out.println(replacePhoneNumber);

    }
}
