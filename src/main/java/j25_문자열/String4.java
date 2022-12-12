package Variable.src.main.java.j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// startsWith   : 시작하는 단어를 검색한다(맨처음 한 단어만 일치해도 검색된다) ex) ROLE <- "R"첫단어
// endsWith     : 맨끝에 단어를 검색한다(맨끝 한 단어만 일치해도 검색된다)  ex) ROLE <- "E" 첫단어

public class String4 {
    public static void main(String[] args) {

        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(",");

        List<String> roleList = Arrays.asList(roleArray);
        List<String> validRoleList = new ArrayList<String>();
        List<String> validRoleList2 = new ArrayList<String>();

        roleList.forEach(role -> {
            if(role.startsWith("ROLE")){
                validRoleList.add(role);
            }
        });
        System.out.println(validRoleList);

        roleList.forEach(role ->{
           if(role.endsWith("MANAGER") || role.endsWith("ADMIN")){
               validRoleList2.add(role);
           }
        });
        System.out.println(validRoleList2);
    }
}
