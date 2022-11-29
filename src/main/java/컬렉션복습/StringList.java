package 컬렉션복습;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        //값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");

        printCollection(list);

        list.add(1, "문자열5");
        printCollection(list);

        // 새 영역에 기존 리스트값 전부 추가
        ArrayList<String> addAllList = new ArrayList<String>();

        addAllList.addAll(list);
        addAllList.addAll(2, list); //2번 인덱스부터 전부 추가
        printCollection(addAllList);

        // 값 조회
        String str1 = list.get(0);
        System.out.println("str1: "+str1);

        // 반복을 사용한 값 조회
        for(String str : list){
            System.out.println("str: "+str);
        }
        for(int i=0; i< list.size(); i++){
            System.out.println("일반 for문 사용한 list: "+list.get(i));
        }
        // Iterator 를 사용한 값 조회
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator 를 사용한 list: "+it.next());
        }

    }
    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }
}
