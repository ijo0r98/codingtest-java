package ex.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        HashSet<Integer> set = new HashSet<Integer>();
//        HashSet<Integer> set = new HashSet<Integer>(10); // 초기 용량
//        HashSet<Integer> set = new HashSet<Integer>(10, 0.7f); // capacity, load factor 지정
//        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(set); // [1, 2, 3]

        // Set은 저장공간이 부족하면 저장용량을 약 2배로 늘림, 따라서 미리 지정해주는 것이 좋음

        // 추가
        set.add(1);
        set.add(2);

        // 삭제
        set.remove(1);
        set.clear();

        // 크기 구하기
        int size = set.size();

        // 출력
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next());
        }

        // 검색
        boolean isContains = set.contains(1); // true



    }
}
