package j19_컬렉션;

import java.util.*;

public class StringSet {
    public static void main(String[] args) {

        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();

        strSet.add("이동빈");
        strSet.add("이승아");
        strSet.add("우예희");
        strSet.add("이종준");
        strSet.add("변상원");

        // 값 추가
        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김민준");
        strSet.add("송아셀");

        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);

        //값조회
        String seachName = "김준일";

        /* strSet 에 김준일이 있으면 true, 없으면 false 출력하기 */

        boolean isTrue = false;
            for (String name : strSet) {
                if (name.equals(seachName)) {
                    isTrue = true;
                    break;
                }
            }
            System.out.println(isTrue);
            // 수정
        /*
            송아셀 -> 남강석
         */
        String seachNametwo = "송아셀";

            for (String name : strSet ) {
                if (name.equals(seachNametwo)) {
                    strSet.remove("송아셀");
                    strSet.add("남강석");
                    break;
                }
            }
            System.out.println(strSet);

            seachName = "김준일";

        System.out.println(strSet.contains(seachName)); // <- 위에 true false 한줄로 처리
        if(strSet.contains(seachName)){
            strSet.remove(seachName);
            strSet.add("김준이");
        }
        System.out.println(strSet);
        }
    }
