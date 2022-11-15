package j25_문자열;

import java.util.UUID;

public class UUIDString {
    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();
        String uuidRecipe = uuid.replaceAll("_", "");
//        System.out.println(uuid.replaceAll("-", ""));

        int uuidLength = uuidRecipe.length();

        int uuidHalfIndex = uuidLength / 2;

        System.out.println("left id: "+uuid.substring(0, uuidHalfIndex));
        System.out.println("Right id: "+uuid.substring(uuidHalfIndex));

    }
}
