package j19_컬렉션;

import java.util.*;

public class StringMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        List<String> list = new ArrayList<>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println("-----------------map 조회--------------------");
        System.out.println(list);
        System.out.println(list.get(3));

        map.put(2022001, "김준일");
        map.put(2022002, "이동빈");
        map.put(2022003, "도정민");
        map.put(2022004, "최해혁");
        map.put(2022005, "김준일");

        System.out.println(map);
        System.out.println(map.get(2022001));
        System.out.println("-----------------조회 및 변경--------------------");
        /**
         * 2022003 학번의 학생의 이름을 (도정민) -> 김완준으로 바꿔라
         */
        //put 을 이용한 변경
        int searchId = 2022003;
        map.put(searchId, "김완준");
        System.out.println(map);

        // 값 수정
        map.replace(searchId, "이성욱");   // list set() 과 같다
        System.out.println(map);

        // 값 삭제
        System.out.println("-----------------삭제--------------------");
        map.remove(searchId);
        System.out.println(map);


        System.out.println("-----------------true/false--------------------");
        boolean searchSuccessFlag =  map.containsKey(2022001);
        System.out.println(searchSuccessFlag);

        boolean searchSuccessFlag2 =  map.containsKey(2022010);
        System.out.println(searchSuccessFlag2);

        System.out.println("-----------------리스트 분리--------------------");
        /*
        list 에서 배운 getId, getName 같은 리스트형식으로 변경
        getKey() 는 map key 값
        getValue() 는 map value 값
         */
        Set<Map.Entry<Integer, String>> entry = map.entrySet();
        List<Map.Entry<Integer, String>> entries = new ArrayList<Map.Entry<Integer, String>>();

        entries.addAll(entry);
        System.out.println("entry리스트"+entries);

        Iterator<Map.Entry<Integer, String>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            }
        System.out.println("-------------keySet, Value 구분 출력----------------");
        Set<Integer> keySet = map.keySet();

        System.out.println("keySet >>>> "+keySet);

        Collection<String> value = map.values();
        System.out.println("value >>>> "+value);
        }
    }
