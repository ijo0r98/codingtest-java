package ex.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {

        // LinkedList list = new LinkedList();
        // 내부 값을 사용해야할 때 캐스팅을 사용해야 하고 잘못된 타입의 경우 오류발생할 수 있음 -> 지향
        // 타입을 명시해주는 것이 좋음, jdk1.5부터 제네릭 타입 지원

        LinkedList<Integer> list = new LinkedList<>();
//        LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1. 2. 3, 4));

        // 추가
        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.addLast(3);

        // 길이
        int size = list.size();
        System.out.println(size); // 4

        // 조회 - ArrayList보다 성능이 좋지 않음
        int first = list.get(0);
        System.out.println(first); // 0

        // 전체 조회
        for(Integer i: list) {
            System.out.print(i); // 0 1 2 3 0
        }


        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next()); // 0 1 2 3
        }

        // 수정
        list.set(0, -1);
        System.out.println(list); // [-1, 1, 2, 3]

        // 검색
        boolean isContains = list.contains(0);
        System.out.println(isContains); // false
        int index = list.indexOf(3);
        System.out.println(index); // 3

        // 삭제
        list.remove();
        list.remove(1);
        System.out.println(list); // [1, 3]
    }
}
