package Variable.src.main.java.j25_문자열;

public class String2 {
    public static void main(String[] args) {

        String phoneNumber = "010-9988-1916";

        int index = phoneNumber.indexOf("-");
        int lastIndex = phoneNumber.lastIndexOf("-");


        System.out.println(index);
        System.out.println(lastIndex);

        String subStringLastNumber = phoneNumber.substring(index+1);
        String subStringLastNumber2 = phoneNumber.substring(index+1, lastIndex);


        System.out.println("Index: " + subStringLastNumber);
        System.out.println(subStringLastNumber2);
    }
}
