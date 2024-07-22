package ex.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        List<String> list = new ArrayList();

        // 객체 추가
        list.add("hello");
        list.add("world");
        list.add(0, "hi");
        System.out.println(list); // [hi, hello, world]

        // 리스트 길이
        int size = list.size();
        System.out.println(size); // 3

        // 검색
        boolean isContains1 = list.contains("world");
        boolean isContains2 = list.contains("helloo");
        System.out.println(isContains1 + " " + isContains2); // true false

        int index = list.indexOf("hello"); // 1
        // 인덱스 조회
        String str = list.get(1);
        System.out.println(str); // hello

        for(String s : list) {
            System.out.print(s); // hi hello world
        }

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()); // hi hello world
        }

        // 수정
        list.set(2, "world!");
        System.out.println(list); // [hi, hello, world!]

        // 삭제
        list.remove(0);
        System.out.println(list); // [hello, world]

        // 전체 삭제
        list.clear();
    }
}
